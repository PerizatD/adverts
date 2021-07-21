package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.dto.ClientDto;
import kg.megacom.adverts.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ClientDto saveClient (@RequestBody ClientDto clientDto){
        return clientService.save(clientDto);
    }
}
