package com.manan.dal.assignment2.bad;

import java.util.ArrayList;

public class DiscordResponseService {

    public DiscordResponse DiscordResponse() {
        //here business logic can reside

        ArrayList<String> response = new ArrayList<>();
        response.add("https://i.redd.it/b78j81vh2hy71.png");

        return new DiscordRedditResponse(response);
    }

    public DiscordResponse DiscordError(){
        return new DiscordErrorResponse();
    }
}
