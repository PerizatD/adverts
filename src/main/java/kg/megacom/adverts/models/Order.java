package kg.megacom.adverts.models;

import kg.megacom.adverts.enums.OrderStatus;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;
    @NonNull
    private String text;
    private Date date;
    private int amount;
    private OrderStatus orderStatus;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    private double finalSum;

}
