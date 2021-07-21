package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.OrderDay;
import kg.megacom.adverts.models.dto.OrderDayDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface OrderDayMapper {

    OrderDayMapper INSTANCE = Mappers.getMapper(OrderDayMapper.class);
    OrderDayDto orderDayToOrderDayDto(OrderDay orderDay);
    OrderDay orderDayDtoToOrderDay(OrderDayDto orderDayDto);
    List<OrderDay> orderDayListToOrderDayToList(List<OrderDay>orderDayList);
    List<OrderDayDto> orderDayDtoListToOrderDayToList(List<OrderDayDto>orderDayDtoList);
}
