package br.com.msintegracaoibge.infra;

import br.com.msintegracaoibge.core.ClasseCnaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class IbgeClient {

    @Autowired
    private WebClient webClient;

    public ClasseCnaeDto consultarCnae(String cnae) {
        return webClient
                .get()
                .uri("/classes/".concat(cnae))
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Favor informar um ID da classe do CNAE válido.")))
                .bodyToMono(ClasseCnaeDto.class)
                .timeout(Duration.of(45000, ChronoUnit.MILLIS))
                .block();
    }
}
