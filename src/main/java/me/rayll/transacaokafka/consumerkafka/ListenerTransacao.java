package me.rayll.transacaokafka.consumerkafka;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

    @KafkaListener(groupId = "api-transacoes",topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoDTO dto) {
        System.out.println(dto);
    }

    @Bean
    JsonMessageConverter jsonMessageConverter() {
        return new JsonMessageConverter();
    }
}
