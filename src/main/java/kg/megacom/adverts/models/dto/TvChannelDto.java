package kg.megacom.adverts.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;
@Data
public class TvChannelDto {

    private Long id;
    @JsonIgnore
    private String name;
    private String logo;
    private Boolean isActive;
    private Long price;
}
