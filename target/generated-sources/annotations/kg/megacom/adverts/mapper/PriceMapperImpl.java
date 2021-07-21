package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.Price;
import kg.megacom.adverts.models.dto.PriceDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceDto priceToPriceDto(Price price) {
        if ( price == null ) {
            return null;
        }

        PriceDto priceDto = new PriceDto();

        priceDto.setId( price.getId() );
        priceDto.setPrice( price.getPrice() );
        priceDto.setStartDate( price.getStartDate() );
        priceDto.setEndDate( price.getEndDate() );
        priceDto.setTv_channel( price.getTv_channel() );

        return priceDto;
    }

    @Override
    public Price priceDtoToPrice(PriceDto priceDto) {
        if ( priceDto == null ) {
            return null;
        }

        Price price = new Price();

        price.setId( priceDto.getId() );
        price.setPrice( priceDto.getPrice() );
        price.setStartDate( priceDto.getStartDate() );
        price.setEndDate( priceDto.getEndDate() );
        price.setTv_channel( priceDto.getTv_channel() );

        return price;
    }

    @Override
    public List<Price> priceListToPriceToList(List<Price> priceList) {
        if ( priceList == null ) {
            return null;
        }

        List<Price> list = new ArrayList<Price>( priceList.size() );
        for ( Price price : priceList ) {
            list.add( price );
        }

        return list;
    }

    @Override
    public List<PriceDto> priceDtoListToPriceToList(List<PriceDto> priceDtoList) {
        if ( priceDtoList == null ) {
            return null;
        }

        List<PriceDto> list = new ArrayList<PriceDto>( priceDtoList.size() );
        for ( PriceDto priceDto : priceDtoList ) {
            list.add( priceDto );
        }

        return list;
    }
}
