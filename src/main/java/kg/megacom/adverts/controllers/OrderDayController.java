package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.OrderDay;
import kg.megacom.adverts.services.OrderDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderDay")
public class OrderDayController {
    @Autowired
    private OrderDayService orderDayService;

    @PostMapping("/save")
    public OrderDay saveOrderDay(@RequestBody OrderDay orderDay){
        return orderDayService.save(orderDay);
    }
}
