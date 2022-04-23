package com.manan.dal.assignment2.bad;

import java.util.List;

public class DiscordErrorResponse extends DiscordResponse{
    @Override
    public String getMessageType() {
        return "Error";
    }

    @Override
    public List<String> getResponse() {
        return null;
    }
}
