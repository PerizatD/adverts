package kg.megacom.adverts.models.objects;

import kg.megacom.adverts.models.TvChannel;
import kg.megacom.adverts.models.dto.TvChannelDto;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ChannelDays {

    private TvChannelDto tvChannel;
    private List<Date> dates;
}
