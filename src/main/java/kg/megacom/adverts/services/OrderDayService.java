package kg.megacom.adverts.services;

import kg.megacom.adverts.models.OrderDay;
import kg.megacom.adverts.models.dto.OrderDayDto;

public interface OrderDayService {

    OrderDay save (OrderDay orderDay);

    OrderDayDto findById (Long id);

    OrderDayDto update (OrderDayDto orderDayDto);
}
