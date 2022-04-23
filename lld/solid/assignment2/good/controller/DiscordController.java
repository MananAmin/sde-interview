package com.manan.dal.assignment2.good.controller;

import com.manan.dal.assignment2.good.service.DiscordResponseService;
import com.manan.dal.assignment2.good.model.DiscordResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for Discord REST Endpoint
 */
@RestController
@RequestMapping("/good")
public class DiscordController {
    private DiscordResponseService discordService;

    public DiscordController(DiscordResponseService discordService) {
        this.discordService = discordService;
    }

    @RequestMapping(value = "/discord")
    public DiscordResponse discord() {
        try{
            return this.discordService.getResponse();
        }
        catch (Exception e){
            return this.discordService.getError();
        }
    }

}
