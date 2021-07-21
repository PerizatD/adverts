package kg.megacom.adverts.services;

import kg.megacom.adverts.models.OrderDetail;
import kg.megacom.adverts.models.dto.OrderDetailDto;
import kg.megacom.adverts.models.dto.OrderDto;

import java.util.List;

public interface OrderDetailService {

    OrderDetailDto save (OrderDetailDto orderDetailDto);

    OrderDetailDto findById (Long id);

    OrderDetailDto update (OrderDetailDto orderDetailDto);

    List<OrderDetailDto> findAllByOrders(OrderDto orderDto);
}
