package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.dao.DiscountRepository;
import kg.megacom.adverts.mapper.ClientMapper;
import kg.megacom.adverts.mapper.DiscountMapper;
import kg.megacom.adverts.models.Client;
import kg.megacom.adverts.models.Discount;
import kg.megacom.adverts.models.dto.DiscountDto;
import kg.megacom.adverts.services.DiscountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServicesImpl implements DiscountServices {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public DiscountDto save(DiscountDto discountDto) {
        Discount discount = DiscountMapper.INSTANCE.discountDtoToDiscount(discountDto);
        discount = discountRepository.save(discount);
        return DiscountMapper.INSTANCE.discountToDiscountDto(discount);
    }

    @Override
    public DiscountDto findByTvChannelAndMinDay(int days, Long id) {
        System.out.println(days);
        Discount discount = discountRepository.findByTvChannelAndMinDay(days, id);
        System.out.println("db " + discount);
        return DiscountMapper.INSTANCE.discountToDiscountDto(discount);
    }
}
