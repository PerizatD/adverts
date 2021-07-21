package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    ClientDto clientToClientDto(Client client);
    Client clientDtoToClient(ClientDto clientDto);
    List<Client> clientListToClientToList(List<Client>clientList);
    List<ClientDto> clientDtoListToClientToList(List<ClientDto>clientDtoList);
}
