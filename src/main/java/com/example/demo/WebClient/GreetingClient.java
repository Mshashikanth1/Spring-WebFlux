package com.example.demo.WebClient;

import com.example.demo.DTO.Greeting;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import org.springframework.web.reactive.function.client.WebClient;


public class GreetingClient {
    private final WebClient client;

    // Spring Boot auto-configures a `WebClient.Builder` instance with nice defaults and customizations.
    // We can use it to create a dedicated `WebClient` for our component.
    public GreetingClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getMessage() {
        return this.client.get().uri("/hello").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Greeting.class)
                .map(Greeting::getMessage);
    }
}
