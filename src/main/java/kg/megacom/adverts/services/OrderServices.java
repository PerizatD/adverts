package kg.megacom.adverts.services;

import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.dto.OrderDto;
import kg.megacom.adverts.models.objects.FinalResponse;
import kg.megacom.adverts.models.objects.InputInfo;

public interface OrderServices {

    FinalResponse confirmOrder(InputInfo inputInfo);

    OrderDto save(OrderDto orderDto);

    OrderDto update (OrderDto orderDto);



}
