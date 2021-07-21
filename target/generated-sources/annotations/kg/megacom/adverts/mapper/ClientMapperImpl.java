package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.dto.ClientDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDto clientToClientDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setId( client.getId() );
        clientDto.setName( client.getName() );
        clientDto.setPhone( client.getPhone() );
        clientDto.setEmail( client.getEmail() );

        return clientDto;
    }

    @Override
    public Client clientDtoToClient(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.getId() );
        client.setName( clientDto.getName() );
        client.setPhone( clientDto.getPhone() );
        client.setEmail( clientDto.getEmail() );

        return client;
    }

    @Override
    public List<Client> clientListToClientToList(List<Client> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<Client> list = new ArrayList<Client>( clientList.size() );
        for ( Client client : clientList ) {
            list.add( client );
        }

        return list;
    }

    @Override
    public List<ClientDto> clientDtoListToClientToList(List<ClientDto> clientDtoList) {
        if ( clientDtoList == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( clientDtoList.size() );
        for ( ClientDto clientDto : clientDtoList ) {
            list.add( clientDto );
        }

        return list;
    }
}
