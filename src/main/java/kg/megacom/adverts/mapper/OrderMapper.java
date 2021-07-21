package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDto orderToOrderDto(Order order);
    Order orderDtoToOrder(OrderDto orderDto);
    List<Order> orderListToOrderToList(List<Order>orderList);
    List<OrderDto> orderDtoListToOrderToList(List<OrderDto>orderDtoList);
}
