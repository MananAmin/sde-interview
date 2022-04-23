package com.manan.dal.assignment2.good.controller;

import com.manan.dal.assignment2.good.service.RedditService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Class for Reddit Service
 */
@RestController
@RequestMapping("/good")
public class RedditController {

    private RedditService redditService;

    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @RequestMapping(value="/reddit")
    public String reddit(String channel)  {

        // process channel
        if (channel == null) {
            return redditService.getErrorResponse();
        }
        String redditURL = this.redditService.getURL(channel);

        return "reddit "+channel+"'s post URL: "+redditURL;
    }
}
