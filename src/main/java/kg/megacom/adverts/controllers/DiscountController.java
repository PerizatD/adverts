package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.Discount;
import kg.megacom.adverts.models.dto.DiscountDto;
import kg.megacom.adverts.services.DiscountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/discount")
public class DiscountController {

    @Autowired
    private DiscountServices discountServices;

    @PostMapping("/save")
    public DiscountDto saveDiscount(@RequestBody DiscountDto discountDto){
        return discountServices.save(discountDto);
    }
}
