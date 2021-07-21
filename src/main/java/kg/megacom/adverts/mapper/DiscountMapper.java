package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.Discount;
import kg.megacom.adverts.models.dto.DiscountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface DiscountMapper {

    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    DiscountDto discountToDiscountDto(Discount discount);
    Discount discountDtoToDiscount(DiscountDto discountDto);
    List<Discount> discountListToDiscountToList(List<Discount>discountList);
    List<DiscountDto> discountDtoListToDiscountToList(List<DiscountDto>discountDtoList);
}
