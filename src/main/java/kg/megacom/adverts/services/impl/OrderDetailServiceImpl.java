package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.OrderDetailRepository;
import kg.megacom.adverts.mapper.ClientMapper;
import kg.megacom.adverts.mapper.OrderDetailMapper;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.OrderDetail;
import kg.megacom.adverts.models.dto.OrderDetailDto;
import kg.megacom.adverts.models.dto.OrderDto;
import kg.megacom.adverts.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetailDto save(OrderDetailDto orderDetailDto) {
        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailDtoToOrderDetail(orderDetailDto);
        orderDetail = orderDetailRepository.save(orderDetail);
        return OrderDetailMapper.INSTANCE.orderDetailToOrderDetailDto(orderDetail);
    }

    @Override
    public OrderDetailDto findById(Long id) {
        return null;
    }

    @Override
    public OrderDetailDto update(OrderDetailDto orderDetailDto) {
        return null;
    }

    @Override
    public List<OrderDetailDto> findAllByOrders(OrderDto orderDto) {
        List<OrderDetail> orderDetailList = orderDetailRepository.findAllByOrderId(orderDto.getId());
        return OrderDetailMapper.INSTANCE.orderDetailDtoListToOrderDetailToList(orderDetailList);
    }
}
