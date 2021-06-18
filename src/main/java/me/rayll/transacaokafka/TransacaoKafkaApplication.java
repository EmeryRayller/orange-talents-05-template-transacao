package me.rayll.transacaokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class TransacaoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacaoKafkaApplication.class, args);
	}

}
