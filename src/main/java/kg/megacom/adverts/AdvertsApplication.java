package kg.megacom.adverts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("kg.megacom.adverts.microservice")
@EnableDiscoveryClient
public class AdvertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertsApplication.class, args);
	}

}
