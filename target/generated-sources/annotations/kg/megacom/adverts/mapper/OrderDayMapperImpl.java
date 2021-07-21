package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.OrderDay;
import kg.megacom.adverts.models.dto.OrderDayDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class OrderDayMapperImpl implements OrderDayMapper {

    @Override
    public OrderDayDto orderDayToOrderDayDto(OrderDay orderDay) {
        if ( orderDay == null ) {
            return null;
        }

        OrderDayDto orderDayDto = new OrderDayDto();

        orderDayDto.setId( orderDay.getId() );
        orderDayDto.setOrderDate( orderDay.getOrderDate() );
        orderDayDto.setOrderDetail( orderDay.getOrderDetail() );

        return orderDayDto;
    }

    @Override
    public OrderDay orderDayDtoToOrderDay(OrderDayDto orderDayDto) {
        if ( orderDayDto == null ) {
            return null;
        }

        OrderDay orderDay = new OrderDay();

        orderDay.setId( orderDayDto.getId() );
        orderDay.setOrderDate( orderDayDto.getOrderDate() );
        orderDay.setOrderDetail( orderDayDto.getOrderDetail() );

        return orderDay;
    }

    @Override
    public List<OrderDay> orderDayListToOrderDayToList(List<OrderDay> orderDayList) {
        if ( orderDayList == null ) {
            return null;
        }

        List<OrderDay> list = new ArrayList<OrderDay>( orderDayList.size() );
        for ( OrderDay orderDay : orderDayList ) {
            list.add( orderDay );
        }

        return list;
    }

    @Override
    public List<OrderDayDto> orderDayDtoListToOrderDayToList(List<OrderDayDto> orderDayDtoList) {
        if ( orderDayDtoList == null ) {
            return null;
        }

        List<OrderDayDto> list = new ArrayList<OrderDayDto>( orderDayDtoList.size() );
        for ( OrderDayDto orderDayDto : orderDayDtoList ) {
            list.add( orderDayDto );
        }

        return list;
    }
}
