package com.example.demo.Router;

import com.example.demo.WebClient.NumbersFact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class coolApi {
    private final NumbersFact numbersFact;

    public coolApi(NumbersFact numbersFact) {
        this.numbersFact = numbersFact;
    }
    @GetMapping(value="/random/number/fact")
    public Mono<String> getRandomNumberFact(){
        return numbersFact.getRandomFact();
    }
}
