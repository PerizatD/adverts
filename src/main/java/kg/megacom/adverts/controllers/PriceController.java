package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.Price;
import kg.megacom.adverts.models.dto.PriceDto;
import kg.megacom.adverts.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/price")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @PostMapping
    public PriceDto savePrice (@RequestBody PriceDto priceDto){
        return priceService.save(priceDto);
    }
}
