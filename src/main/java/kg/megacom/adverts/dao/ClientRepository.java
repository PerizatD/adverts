package kg.megacom.adverts.dao;

import kg.megacom.adverts.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByPhone(String phone);
}
