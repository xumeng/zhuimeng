package com.amonxu.zhuimeng.user.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.amonxu.zhuimeng.facade.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xumeng on 07/03/2018.
 */
@RestController
public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/login")
    @Override
    public String login(String username, String password) {
        return "login success";
    }
}
