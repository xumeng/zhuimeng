package com.amonxu.zhuimeng.controller.user;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xumeng on 07/03/2018.
 */
@RestController
public interface UserController {
    public String login(String username, String password);
}
