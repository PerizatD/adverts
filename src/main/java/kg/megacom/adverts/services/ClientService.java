package kg.megacom.adverts.services;

import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.dto.ClientDto;

public interface ClientService {

    ClientDto save (ClientDto clientDto);

    ClientDto findById (Long id);

    ClientDto update (ClientDto clientDto);

    ClientDto findByPhone(String phone);
}
