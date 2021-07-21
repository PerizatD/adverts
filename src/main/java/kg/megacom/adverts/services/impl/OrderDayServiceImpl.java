package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.OrderDayRepository;
import kg.megacom.adverts.models.OrderDay;
import kg.megacom.adverts.models.dto.OrderDayDto;
import kg.megacom.adverts.services.OrderDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDayServiceImpl implements OrderDayService {

    @Autowired
    private OrderDayRepository orderDayRepository;

    @Override
    public OrderDay save(OrderDay orderDay) {
        return orderDayRepository.save(orderDay);
    }

    @Override
    public OrderDayDto findById(Long id) {
        return null;
    }

    @Override
    public OrderDayDto update(OrderDayDto orderDayDto) {
        return null;
    }
}
