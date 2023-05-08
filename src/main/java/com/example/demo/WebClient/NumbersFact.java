package com.example.demo.WebClient;

import com.example.demo.DTO.Greeting;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class NumbersFact {
    private final WebClient webClient;


    public NumbersFact(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getRandomFact(){
         return this.webClient.get().uri("http://numbersapi.com/random").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> getFactsInRange(String min,String max){
        return this.webClient.get().uri("http://numbersapi.com/"
                        .concat(min)
                        .concat(",")
                        .concat(max)).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }
}
