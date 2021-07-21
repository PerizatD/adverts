package kg.megacom.adverts.dao;

import kg.megacom.adverts.models.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

    @Query(value = "select * from discount d where d.day = (select MAX(day) from discount d where d.day < ?1) and current_timestamp between start_date and end_date and d.tv_channel_id = ?2", nativeQuery = true)
    Discount findByTvChannelAndMinDay(int days, Long id);
}
