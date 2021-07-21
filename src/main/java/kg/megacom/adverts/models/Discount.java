package kg.megacom.adverts.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discount")
@Data
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int day;
    private int percent;
    private Date startDate;
    private Date endDate;
    @ManyToOne()
    @JoinColumn(name = "tv_channel_id")
    private TvChannel tvChannel;
}
