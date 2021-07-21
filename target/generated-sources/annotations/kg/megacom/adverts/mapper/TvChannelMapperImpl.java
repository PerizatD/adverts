package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.TvChannelDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class TvChannelMapperImpl implements TvChannelMapper {

    @Override
    public TvChannelDto tvChannelToTvChannelDto(TvChannel tvChannel) {
        if ( tvChannel == null ) {
            return null;
        }

        TvChannelDto tvChannelDto = new TvChannelDto();

        tvChannelDto.setId( tvChannel.getId() );
        tvChannelDto.setName( tvChannel.getName() );
        tvChannelDto.setLogo( tvChannel.getLogo() );
        tvChannelDto.setIsActive( tvChannel.getIsActive() );

        return tvChannelDto;
    }

    @Override
    public TvChannel tvChannelDtoToTvChannel(TvChannelDto tvChannelDto) {
        if ( tvChannelDto == null ) {
            return null;
        }

        TvChannel tvChannel = new TvChannel();

        tvChannel.setId( tvChannelDto.getId() );
        tvChannel.setName( tvChannelDto.getName() );
        tvChannel.setLogo( tvChannelDto.getLogo() );
        tvChannel.setIsActive( tvChannelDto.getIsActive() );

        return tvChannel;
    }

    @Override
    public List<TvChannel> tvChannelListToTvChannelToList(List<TvChannel> tvChannelList) {
        if ( tvChannelList == null ) {
            return null;
        }

        List<TvChannel> list = new ArrayList<TvChannel>( tvChannelList.size() );
        for ( TvChannel tvChannel : tvChannelList ) {
            list.add( tvChannel );
        }

        return list;
    }

    @Override
    public List<TvChannelDto> tvChannelDtoListToTvChannelToList(List<TvChannelDto> tvChannelDtoList) {
        if ( tvChannelDtoList == null ) {
            return null;
        }

        List<TvChannelDto> list = new ArrayList<TvChannelDto>( tvChannelDtoList.size() );
        for ( TvChannelDto tvChannelDto : tvChannelDtoList ) {
            list.add( tvChannelDto );
        }

        return list;
    }
}
