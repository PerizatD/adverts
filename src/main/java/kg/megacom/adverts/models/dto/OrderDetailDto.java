package kg.megacom.adverts.models.dto;

import kg.megacom.adverts.models.Order;
import kg.megacom.adverts.models.TvChannel;
import lombok.Data;
@Data
public class OrderDetailDto {

    private Long id;
    private OrderDto order;
    private TvChannelDto tvChannel;
    private double totalSum;
}
