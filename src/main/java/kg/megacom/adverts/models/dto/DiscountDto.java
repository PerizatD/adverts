package kg.megacom.adverts.models.dto;

import kg.megacom.adverts.models.TvChannel;
import lombok.Data;
import java.util.Date;

@Data
public class DiscountDto {

    private Long id;
    private int day;
    private int percent;
    private Date startDate;
    private Date endDate;
    private TvChannel tvChannel;

}
