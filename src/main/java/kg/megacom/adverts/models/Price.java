package kg.megacom.adverts.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prices")
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    @ManyToOne()
    @JoinColumn(name = "tv_channel_id")
    private TvChannel tv_channel;
}
