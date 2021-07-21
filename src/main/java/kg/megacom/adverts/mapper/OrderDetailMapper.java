package kg.megacom.adverts.mapper;

import kg.megacom.adverts.models.OrderDetail;
import kg.megacom.adverts.models.dto.OrderDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);
    OrderDetailDto orderDetailToOrderDetailDto(OrderDetail orderDetail);
    OrderDetail orderDetailDtoToOrderDetail(OrderDetailDto orderDetailDto);
    List<OrderDetail> orderDetailListToOrderDetailToList(List<OrderDetailDto>orderDetailList);
    List<OrderDetailDto> orderDetailDtoListToOrderDetailToList(List<OrderDetail>orderDetailDtoList);
}
