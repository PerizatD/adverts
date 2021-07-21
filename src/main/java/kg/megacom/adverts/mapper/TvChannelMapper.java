package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.TvChannelDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TvChannelMapper {

    TvChannelMapper INSTANCE = Mappers.getMapper(TvChannelMapper.class);
    TvChannelDto tvChannelToTvChannelDto(TvChannel tvChannel);
    TvChannel tvChannelDtoToTvChannel(TvChannelDto tvChannelDto);
    List<TvChannel> tvChannelListToTvChannelToList(List<TvChannel>tvChannelList);
    List<TvChannelDto> tvChannelDtoListToTvChannelToList(List<TvChannelDto>tvChannelDtoList);


}
