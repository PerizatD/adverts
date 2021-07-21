package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.dto.ClientDto;
import kg.megacom.adverts.models.dto.OrderDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto orderToOrderDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( order.getId() );
        orderDto.setText( order.getText() );
        orderDto.setDate( order.getDate() );
        orderDto.setAmount( order.getAmount() );
        orderDto.setOrderStatus( order.getOrderStatus() );
        orderDto.setClient( clientToClientDto( order.getClient() ) );
        orderDto.setFinalSum( order.getFinalSum() );

        return orderDto;
    }

    @Override
    public Order orderDtoToOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        String text = null;

        text = orderDto.getText();

        Order order = new Order( text );

        order.setId( orderDto.getId() );
        order.setDate( orderDto.getDate() );
        order.setAmount( orderDto.getAmount() );
        order.setOrderStatus( orderDto.getOrderStatus() );
        order.setClient( clientDtoToClient( orderDto.getClient() ) );
        order.setFinalSum( orderDto.getFinalSum() );

        return order;
    }

    @Override
    public List<Order> orderListToOrderToList(List<Order> orderList) {
        if ( orderList == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( orderList.size() );
        for ( Order order : orderList ) {
            list.add( order );
        }

        return list;
    }

    @Override
    public List<OrderDto> orderDtoListToOrderToList(List<OrderDto> orderDtoList) {
        if ( orderDtoList == null ) {
            return null;
        }

        List<OrderDto> list = new ArrayList<OrderDto>( orderDtoList.size() );
        for ( OrderDto orderDto : orderDtoList ) {
            list.add( orderDto );
        }

        return list;
    }

    protected ClientDto clientToClientDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setId( client.getId() );
        clientDto.setName( client.getName() );
        clientDto.setPhone( client.getPhone() );
        clientDto.setEmail( client.getEmail() );

        return clientDto;
    }

    protected Client clientDtoToClient(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.getId() );
        client.setName( clientDto.getName() );
        client.setPhone( clientDto.getPhone() );
        client.setEmail( clientDto.getEmail() );

        return client;
    }
}
