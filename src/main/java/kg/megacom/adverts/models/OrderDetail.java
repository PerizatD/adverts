package kg.megacom.adverts.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_detail_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "tv_channel_id")
    private TvChannel tvChannel;
    private double totalSum;
}
