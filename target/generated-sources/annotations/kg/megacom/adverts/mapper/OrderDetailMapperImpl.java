package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.OrderDetail;
import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.ClientDto;
import kg.megacom.adverts.models.dto.OrderDetailDto;
import kg.megacom.adverts.models.dto.OrderDto;
import kg.megacom.adverts.models.dto.TvChannelDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:37:57+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetailDto orderDetailToOrderDetailDto(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        OrderDetailDto orderDetailDto = new OrderDetailDto();

        orderDetailDto.setId( orderDetail.getId() );
        orderDetailDto.setOrder( orderToOrderDto( orderDetail.getOrder() ) );
        orderDetailDto.setTvChannel( tvChannelToTvChannelDto( orderDetail.getTvChannel() ) );
        orderDetailDto.setTotalSum( orderDetail.getTotalSum() );

        return orderDetailDto;
    }

    @Override
    public OrderDetail orderDetailDtoToOrderDetail(OrderDetailDto orderDetailDto) {
        if ( orderDetailDto == null ) {
            return null;
        }

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setId( orderDetailDto.getId() );
        orderDetail.setOrder( orderDtoToOrder( orderDetailDto.getOrder() ) );
        orderDetail.setTvChannel( tvChannelDtoToTvChannel( orderDetailDto.getTvChannel() ) );
        orderDetail.setTotalSum( orderDetailDto.getTotalSum() );

        return orderDetail;
    }

    @Override
    public List<OrderDetail> orderDetailListToOrderDetailToList(List<OrderDetailDto> orderDetailList) {
        if ( orderDetailList == null ) {
            return null;
        }

        List<OrderDetail> list = new ArrayList<OrderDetail>( orderDetailList.size() );
        for ( OrderDetailDto orderDetailDto : orderDetailList ) {
            list.add( orderDetailDtoToOrderDetail( orderDetailDto ) );
        }

        return list;
    }

    @Override
    public List<OrderDetailDto> orderDetailDtoListToOrderDetailToList(List<OrderDetail> orderDetailDtoList) {
        if ( orderDetailDtoList == null ) {
            return null;
        }

        List<OrderDetailDto> list = new ArrayList<OrderDetailDto>( orderDetailDtoList.size() );
        for ( OrderDetail orderDetail : orderDetailDtoList ) {
            list.add( orderDetailToOrderDetailDto( orderDetail ) );
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

    protected OrderDto orderToOrderDto(Order order) {
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

    protected TvChannelDto tvChannelToTvChannelDto(TvChannel tvChannel) {
        if ( tvChannel == null ) {
            return null;
        }

        TvChannelDto tvChannelDto = new TvChannelDto();

        tvChannelDto.setId( tvChannel.getId() );
        tvChannelDto.setName( tvChannel.getName() );
        tvChannelDto.setLogo( tvChannel.getLogo() );
        tvChannelDto.setIsActive( tvChannel.getIsActive() );

        return tvChannelDto;
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

    protected Order orderDtoToOrder(OrderDto orderDto) {
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

    protected TvChannel tvChannelDtoToTvChannel(TvChannelDto tvChannelDto) {
        if ( tvChannelDto == null ) {
            return null;
        }

        TvChannel tvChannel = new TvChannel();

        tvChannel.setId( tvChannelDto.getId() );
        tvChannel.setName( tvChannelDto.getName() );
        tvChannel.setLogo( tvChannelDto.getLogo() );
        tvChannel.setIsActive( tvChannelDto.getIsActive() );

        return tvChannel;
    }
}
