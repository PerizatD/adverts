package kg.megacom.adverts.models.dto;

import kg.megacom.adverts.models.OrderDetail;
import lombok.Data;
import java.util.Date;

@Data
public class OrderDayDto {

    private Long id;
    private Date orderDate;
    private OrderDetail orderDetail;

}
