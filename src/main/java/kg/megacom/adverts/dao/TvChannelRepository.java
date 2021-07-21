package kg.megacom.adverts.dao;

import kg.megacom.adverts.models.TvChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvChannelRepository extends JpaRepository<TvChannel, Long> {

}
