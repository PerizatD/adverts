package kg.megacom.adverts.models.objects;

import lombok.Data;

import java.util.List;
@Data
public class InputInfo {

    private String text;
    private int lettersAmount;
    private String name;
    private String phone;
    private String email;

    private List<ChannelDays> channelDaysList;



}
