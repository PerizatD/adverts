package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.Price;
import kg.megacom.adverts.models.dto.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    PriceDto priceToPriceDto(Price price);
    Price priceDtoToPrice(PriceDto priceDto);
    List<Price> priceListToPriceToList(List<Price>priceList);
    List<PriceDto> priceDtoListToPriceToList(List<PriceDto>priceDtoList);
}
