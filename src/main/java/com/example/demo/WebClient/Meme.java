package com.example.demo.WebClient;

import com.example.demo.DTO.memeApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Component
public class Meme {
    private final WebClient webClient;
    private Meme(WebClient.Builder builder){this.webClient=builder.baseUrl("http://localhost:8080").build();}
    public Mono<String> getMeme(){
        return webClient.get().uri("https://meme-api.com/gimme/1")
                .retrieve()
                .bodyToMono(memeApiResponse.class)
                .map(memeApiResponse -> memeApiResponse.getMemes()[0])
                .map(meme -> meme.getUrl());
    }

}
