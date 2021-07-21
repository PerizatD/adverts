package kg.megacom.adverts.services;

import kg.megacom.adverts.models.Discount;
import kg.megacom.adverts.models.dto.DiscountDto;

public interface DiscountServices {

    DiscountDto save (DiscountDto discountDto);

    DiscountDto findByTvChannelAndMinDay(int days,Long id);
}
