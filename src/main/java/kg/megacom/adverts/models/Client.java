package kg.megacom.adverts.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "client_id")
    private Long id;
    private String name;
    private String phone;
    private String email;
}
