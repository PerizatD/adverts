package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.OrderDetail;
import kg.megacom.adverts.models.dto.OrderDetailDto;
import kg.megacom.adverts.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping("/save")
    public OrderDetailDto saveOrderDetail (@RequestBody OrderDetailDto orderDetailDto){
        return orderDetailService.save(orderDetailDto);
    }
}
