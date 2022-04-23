package com.manan.dal.assignment2.bad;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DiscordRedditResponse extends DiscordResponse{
    private List<String> response;

    public DiscordRedditResponse(List<String> response) {
        this.response = response;
    }

    @Override
    public String getMessageType() {
        return "RedditLink";
    }

    @JsonProperty("response")
    public List<String>  getResponse(){
        return response;
    }
}
