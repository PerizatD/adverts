package kg.megacom.adverts.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "order_days")
@Data
public class OrderDay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_day_id")
    private Long id;
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    private OrderDetail orderDetail;
}
