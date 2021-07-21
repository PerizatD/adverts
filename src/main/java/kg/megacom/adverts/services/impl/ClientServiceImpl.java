package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.ClientRepository;
import kg.megacom.adverts.mapper.ClientMapper;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.dto.ClientDto;
import kg.megacom.adverts.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDto save(ClientDto clientDto) {
        Client client = ClientMapper.INSTANCE.clientDtoToClient(clientDto);
        client = clientRepository.save(client);
        return ClientMapper.INSTANCE.clientToClientDto(client);
    }

    @Override
    public ClientDto findById(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if(client == null){
            throw new RuntimeException("Not found");
        }
        return ClientMapper.INSTANCE.clientToClientDto(client);
    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        Client client = clientRepository.findById(clientDto.getId()).orElse(null);
        if (clientDto == null){
            throw new RuntimeException("Not found");
        }
        return ClientMapper.INSTANCE.clientToClientDto(client);
    }

    @Override
    public ClientDto findByPhone(String phone) {
        Client client = clientRepository.findByPhone(phone);
        return ClientMapper.INSTANCE.clientToClientDto(client);
    }
}
