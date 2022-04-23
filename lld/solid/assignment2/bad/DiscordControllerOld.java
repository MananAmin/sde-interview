package com.manan.dal.assignment2.bad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for Discord Controller (changed name due to bean name conflict with good code)
 */
@RestController
@RequestMapping("/bad")
public class DiscordControllerOld {

    @RequestMapping(value = "/discord")
    public DiscordResponse discord()  {
        try{
            return new DiscordResponseService().DiscordResponse();
        }
        catch (Exception e){
            return new DiscordResponseService().DiscordError();
        }
    }
}