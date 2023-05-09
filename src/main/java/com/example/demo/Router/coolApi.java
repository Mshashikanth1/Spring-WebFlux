package com.example.demo.Router;

import com.example.demo.DTO.memeApiResponse;
import com.example.demo.WebClient.Meme;
import com.example.demo.WebClient.NumbersFact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class coolApi {
    private final NumbersFact numbersFact;
    private final Meme meme;

    public coolApi(NumbersFact numbersFact, Meme meme) {
        this.numbersFact = numbersFact;
        this.meme = meme;
    }
    @GetMapping(value="/random/number/fact")
    public Mono<String> getRandomNumberFact(){
        return numbersFact.getRandomFact();
    }
    @GetMapping(value="number/fact/{min}/{max}")
    public Mono<String> getNumberFactsInRange(@PathVariable String min, @PathVariable String max){
        return numbersFact.getFactsInRange(min,max);
    }
    @GetMapping(value="/meme")
    public Mono<String> getAMeme(){
        return meme.getMeme();
    }

}
