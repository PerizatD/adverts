package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.services.TvChannelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/tvChannel")
public class TvChannelController {

    @Autowired
    private TvChannelServices tvChannelServices;

    @PostMapping("/save")
    public TvChannel saveTvChannel(@RequestBody TvChannel tv_channel){
        return tvChannelServices.save(tv_channel);
    }



}
