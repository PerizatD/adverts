package kg.megacom.adverts.services;

import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.TvChannelDto;

public interface TvChannelServices {

    TvChannel save (TvChannel tvChannel);

    TvChannelDto findById(Long id);

    TvChannelDto update(TvChannelDto tvChannelDto);
}
