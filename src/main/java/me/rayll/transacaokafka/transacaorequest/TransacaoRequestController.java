package me.rayll.transacaokafka.transacaorequest;

import me.rayll.transacaokafka.consumerkafka.TransacaoDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/pedidotransacao")
public class TransacaoRequestController {

    private String url = "http://localhost:7777/api/cartoes";

    @PostMapping
    public ResponseEntity<Void> pedidoTransacao(@RequestBody TransacaoDTO dto) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        dto.setId(UUID.randomUUID().toString());

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, new HttpEntity<>(dto, httpHeaders), String.class);

        return ResponseEntity.ok().build();
    }
}
