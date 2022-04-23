package com.manan.dal.assignment2.bad;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public abstract class DiscordResponse {
    @JsonProperty("message_type")
    public abstract String getMessageType();

    @JsonProperty("response")
    public abstract List<String>  getResponse();
}

