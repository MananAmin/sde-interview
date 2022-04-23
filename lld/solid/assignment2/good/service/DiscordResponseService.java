package com.manan.dal.assignment2.good.service;

import com.manan.dal.assignment2.good.model.DiscordResponse;

/**
 * Interface for Discord Response Service
 */
public interface DiscordResponseService {

    DiscordResponse getResponse();
    DiscordResponse getError();
}
