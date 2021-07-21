package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.PriceRepository;
import kg.megacom.adverts.mapper.OrderMapper;
import kg.megacom.adverts.mapper.PriceMapper;
import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.Price;
import kg.megacom.adverts.models.dto.PriceDto;
import kg.megacom.adverts.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    public PriceRepository priceRepository;

    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        Price price1 = priceRepository.save(price);
        return PriceMapper.INSTANCE.priceToPriceDto(price1);
    }

    @Override
    public PriceDto findById(Long id) {
        return null;
    }

    @Override
    public PriceDto update(PriceDto priceDto) {
        return null;
    }

    @Override
    public PriceDto findByChannelsAndDate(Long tvChannelId) {
        Price price = priceRepository.findByChannelsAndDate(tvChannelId);
        System.out.println("price " + price);
        return PriceMapper.INSTANCE.priceToPriceDto(price);
    }
}
