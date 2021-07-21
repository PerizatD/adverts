package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.OrderRepository;
import kg.megacom.adverts.enums.OrderStatus;
import kg.megacom.adverts.mapper.OrderMapper;
import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.dto.*;
import kg.megacom.adverts.models.objects.ChannelDays;
import kg.megacom.adverts.models.objects.FinalResponse;
import kg.megacom.adverts.models.objects.InputInfo;
import kg.megacom.adverts.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServicesImpl implements OrderServices {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ClientService clientService;

    @Autowired
    private OrderServices orderServices;

    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private DiscountServices discountServices;

    @Autowired
    private PriceService priceService;

    @Override
    public FinalResponse confirmOrder(InputInfo inputInfo) {
        FinalResponse finalResponse = new FinalResponse();
        ClientDto clientDto = clientService.findByPhone(inputInfo.getPhone());
        if (clientDto == null) {
            clientDto = new ClientDto();
            clientDto.setName(inputInfo.getName());
            clientDto.setPhone(inputInfo.getPhone());
            clientDto.setEmail(inputInfo.getEmail());
            clientDto = clientService.save(clientDto);
        }

            OrderDto orderDto = new OrderDto();
            orderDto.setAmount(inputInfo.getLettersAmount());
            orderDto.setClient(clientDto);
            orderDto.setOrderStatus(OrderStatus.NOTPAID);
            orderDto.setText(inputInfo.getText());
            OrderDto orderDto1 = orderServices.save(orderDto);

            double totalSum;
            List<ChannelDays> channelDays = inputInfo.getChannelDaysList();
            channelDays.stream()
                    .forEach(x -> {
                        OrderDetailDto orderDetailDto = new OrderDetailDto();
                        orderDetailDto.setOrder(orderDto1);
                        orderDetailDto.setTvChannel(x.getTvChannel());

                        int days = x.getDates().size();

                        DiscountDto discountDto = discountServices.findByTvChannelAndMinDay(days, x.getTvChannel().getId());
                        PriceDto pricesDto = priceService.findByChannelsAndDate(x.getTvChannel().getId());
                        double pricePerSymbol = pricesDto.getPrice();
                        int symbolAmount = inputInfo.getLettersAmount();


                        if (discountDto != null) {
                            int percent = discountDto.getPercent();

                            double withoutDiscount = symbolAmount * pricePerSymbol;
                            double discountInSum = withoutDiscount * percent / 100;
                            double sumForChanel = withoutDiscount - discountInSum;
                            orderDetailDto.setTotalSum(sumForChanel);
                            orderDetailService.save(orderDetailDto);
                        }else {
                            double withoutDiscount = symbolAmount * pricePerSymbol;
                            orderDetailDto.setTotalSum(withoutDiscount);
                            orderDetailService.save(orderDetailDto);
                        }
                    });

            List<OrderDetailDto> orderDetailsDtoList = orderDetailService.findAllByOrders(orderDto1);
            totalSum = orderDetailsDtoList.stream().mapToDouble(x -> x.getTotalSum()).sum();
            System.out.println(totalSum);

            orderDto1.setFinalSum(totalSum);
            update(orderDto1);


            finalResponse.setMessage("Ok");
            finalResponse.setStatus(1);
            finalResponse.setTotalSum(totalSum);

            return finalResponse;
        }





    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepository.save(order);
        return OrderMapper.INSTANCE.orderToOrderDto(order);
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        Order order = orderRepository.findById(orderDto.getId()).orElse(null);
        if(order == null){
            throw new RuntimeException("Order not found!");}
        order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        Order order1 = orderRepository.save(order);
        return OrderMapper.INSTANCE.orderToOrderDto(order1);
    }

}
