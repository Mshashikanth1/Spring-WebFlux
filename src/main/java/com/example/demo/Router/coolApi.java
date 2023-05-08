package com.example.demo.Router;

import com.example.demo.WebClient.NumbersFact;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

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
    @GetMapping(value="number/fact/{min}/{max}")
    public Mono<String> getNumberFactsInRange(@PathVariable String min, @PathVariable String max){
        return numbersFact.getFactsInRange(min,max);
    }

}
