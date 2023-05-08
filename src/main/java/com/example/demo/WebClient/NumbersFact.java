package com.example.demo.WebClient;

import com.example.demo.DTO.Greeting;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Component
public class NumbersFact {
    private final WebClient webClient;

//    public NumbersFact(WebClient webClient) {
//        this.webClient = webClient;
//    }

    public NumbersFact(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getRandomFact(){
         return this.webClient.get().uri("http://numbersapi.com/random").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }
}
