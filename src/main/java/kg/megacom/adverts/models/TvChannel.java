package kg.megacom.adverts.models;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;


@Entity
@Table (name = "tv_channels")
@Data
public class TvChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tv_channel_id")
    private Long id;
    private String name;
    private String logo;
    private Boolean isActive;

    public TvChannel() {
    }
}
