package kg.megacom.adverts.dao;

import kg.megacom.adverts.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query(value = "select * from prices p where p.tv_channel_id = ?1 and current_timestamp between start_date and end_date",nativeQuery = true)
    Price findByChannelsAndDate(Long channelId);
}
