package com.manan.dal.assignment2.good.serviceImp;

import com.manan.dal.assignment2.good.service.RedditService;
import org.springframework.stereotype.Service;

/**
 * implemenatation for Reddit Service
 */
@Service
public class RedditServiceImp implements RedditService {

    @Override
    public String getURL(String channel){
        // Use Reddit API to fetch url from channel name
        // To avoid third-party API usage set static url for demo purpose
        String RedditURL = "https://i.redd.it/b78j81vh2hy71.png";
        return RedditURL;
    }

    @Override
    public String getRandomURL() {
        String RedditURL = "https://i.redd.it/b78j81vh2hy71.png";
        return RedditURL;
    }

    @Override
    public String getErrorResponse() {
        return "Error channel is not passed";
    }
}
