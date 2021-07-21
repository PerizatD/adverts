package kg.megacom.adverts.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kg.megacom.adverts.models.Discount;
import kg.megacom.adverts.models.dto.DiscountDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-17T13:22:03+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class DiscountMapperImpl implements DiscountMapper {

    @Override
    public DiscountDto discountToDiscountDto(Discount discount) {
        if ( discount == null ) {
            return null;
        }

        DiscountDto discountDto = new DiscountDto();

        discountDto.setId( discount.getId() );
        discountDto.setDay( discount.getDay() );
        discountDto.setPercent( discount.getPercent() );
        discountDto.setStartDate( discount.getStartDate() );
        discountDto.setEndDate( discount.getEndDate() );
        discountDto.setTvChannel( discount.getTvChannel() );

        return discountDto;
    }

    @Override
    public Discount discountDtoToDiscount(DiscountDto discountDto) {
        if ( discountDto == null ) {
            return null;
        }

        Discount discount = new Discount();

        discount.setId( discountDto.getId() );
        discount.setDay( discountDto.getDay() );
        discount.setPercent( discountDto.getPercent() );
        discount.setStartDate( discountDto.getStartDate() );
        discount.setEndDate( discountDto.getEndDate() );
        discount.setTvChannel( discountDto.getTvChannel() );

        return discount;
    }

    @Override
    public List<Discount> discountListToDiscountToList(List<Discount> discountList) {
        if ( discountList == null ) {
            return null;
        }

        List<Discount> list = new ArrayList<Discount>( discountList.size() );
        for ( Discount discount : discountList ) {
            list.add( discount );
        }

        return list;
    }

    @Override
    public List<DiscountDto> discountDtoListToDiscountToList(List<DiscountDto> discountDtoList) {
        if ( discountDtoList == null ) {
            return null;
        }

        List<DiscountDto> list = new ArrayList<DiscountDto>( discountDtoList.size() );
        for ( DiscountDto discountDto : discountDtoList ) {
            list.add( discountDto );
        }

        return list;
    }
}
