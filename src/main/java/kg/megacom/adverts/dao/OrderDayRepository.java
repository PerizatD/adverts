package kg.megacom.adverts.dao;

import kg.megacom.adverts.models.OrderDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDayRepository extends JpaRepository<OrderDay, Long> {
}
