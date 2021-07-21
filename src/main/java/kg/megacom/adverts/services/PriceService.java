package kg.megacom.adverts.services;

import kg.megacom.adverts.models.Price;
import kg.megacom.adverts.models.dto.PriceDto;

public interface PriceService {

    PriceDto save (PriceDto priceDto);

    PriceDto findById (Long id);

    PriceDto update (PriceDto priceDto);

    PriceDto findByChannelsAndDate(Long channelId);
}
