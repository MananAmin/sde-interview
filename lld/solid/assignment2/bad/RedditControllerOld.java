package com.manan.dal.assignment2.bad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for Reddit Controller (changed name due to bean name conflict with good code)
 */
@RestController
@RequestMapping("/bad")
public class RedditControllerOld {

    public String getURL(String channel){

        // Use Reddit API to fetch url from channel name
        // To avoid third-party API usage set static url for demo purpose

        String RedditURL = "https://i.redd.it/b78j81vh2hy71.png";
        return RedditURL;
    }

    @RequestMapping(value="/reddit")
    public String reddit(String channel)  {

        // process channel
        if (channel == null) {
            return "Error channel is not passed";
        }

        String redditURL = getURL(channel);
        return "reddit "+channel+"'s post URL: "+redditURL;
    }
}
