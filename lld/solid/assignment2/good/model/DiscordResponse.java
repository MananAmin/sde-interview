package com.manan.dal.assignment2.good.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Abstract Class for Discord Response
 */
public abstract class DiscordResponse {
    @JsonProperty("message_type")
    public abstract String getMessageType();
}

