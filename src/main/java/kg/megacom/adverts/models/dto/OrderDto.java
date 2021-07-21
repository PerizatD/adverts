package kg.megacom.adverts.models.dto;

import kg.megacom.adverts.enums.OrderStatus;
import kg.megacom.adverts.models.Client;
import lombok.Data;
import java.util.Date;

@Data
public class OrderDto {

    private Long id;
    private String text;
    private Date date;
    private int amount;
    private OrderStatus orderStatus;
    private ClientDto client;
    private double finalSum;

}