package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.dto.OrderDto;
import kg.megacom.adverts.models.objects.FinalResponse;
import kg.megacom.adverts.models.objects.InputInfo;
import kg.megacom.adverts.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @PostMapping("/save")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto){
        return orderServices.save(orderDto);
    }

    @PostMapping("/confirm")
    public FinalResponse confirmOrder(@RequestBody InputInfo inputInfo){
        return orderServices.confirmOrder(inputInfo);
    }
}
