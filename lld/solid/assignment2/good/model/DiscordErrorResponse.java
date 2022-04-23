package com.manan.dal.assignment2.good.model;

/**
 * Class for Discord Error Response
 */
public class DiscordErrorResponse extends DiscordResponse {

    @Override
    public String getMessageType() {
        return "Error";
    }

}
