package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.TvChannelRepository;
import kg.megacom.adverts.mapper.TvChannelMapper;
import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.TvChannelDto;
import kg.megacom.adverts.services.TvChannelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TvChannelServicesImpl implements TvChannelServices {

    @Autowired
    private TvChannelRepository tvChannelRepository;

    @Override
    public TvChannel save(TvChannel tvChannel) {
        return tvChannelRepository.save (tvChannel);
    }

    @Override
    public TvChannelDto findById(Long id) {
        TvChannel tvChannel = tvChannelRepository.findById(id).orElse(null);
        if(tvChannel == null){
            throw new RuntimeException("Not found");
        }
        return TvChannelMapper.INSTANCE.tvChannelToTvChannelDto(tvChannel);
    }



    @Override
    public TvChannelDto update(TvChannelDto tvChannelDto) {
        TvChannel tvChannel = tvChannelRepository.findById(tvChannelDto.getId()).orElse(null);
        if(tvChannelDto == null){
            throw new RuntimeException("Not found");
        }
        tvChannel = TvChannelMapper.INSTANCE.tvChannelDtoToTvChannel(tvChannelDto);
        TvChannel tvChannel1 = tvChannelRepository.save(tvChannel);
        return TvChannelMapper.INSTANCE.tvChannelToTvChannelDto(tvChannel1);
    }


}


