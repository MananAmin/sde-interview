package com.manan.dal.assignment2.good.serviceImp;

import com.manan.dal.assignment2.good.model.DiscordErrorResponse;
import com.manan.dal.assignment2.good.model.DiscordRedditResponse;
import com.manan.dal.assignment2.good.model.DiscordResponse;
import com.manan.dal.assignment2.good.service.DiscordResponseService;
import com.manan.dal.assignment2.good.service.RedditService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * implemenatation for DiscordResponse Service
 */
@Service
public class DiscordResponseServiceImp implements DiscordResponseService {

    private RedditService redditService;

    public DiscordResponseServiceImp(RedditService redditService) {
        this.redditService = redditService;
    }

    @Override
    public DiscordResponse getResponse() {
        //here business logic can reside
        ArrayList<String> response = new ArrayList<>();
        response.add(redditService.getRandomURL());
        return new DiscordRedditResponse(response);
    }

    public DiscordErrorResponse getError(){
        return new DiscordErrorResponse();
    }

}
