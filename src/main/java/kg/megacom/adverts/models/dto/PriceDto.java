package kg.megacom.adverts.models.dto;

import kg.megacom.adverts.models.TvChannel;
import lombok.Data;
import java.util.Date;

@Data
public class PriceDto {

    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    private TvChannel tv_channel;
}
