package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize
public class memeApiResponse {
    private  int count;
    private  meme[]  memes ;


    @JsonSerialize
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class meme {
        private  String postLink;
        private  String   subreddit;
        private   String   title;
        private  String url  ;
        private   Boolean  nsfw;
        private   Boolean  spoiler;
        private    String  author;
        private   int  ups;
        private   String[] preview;

    }


}
