package com.amonxu.zhuimeng.user.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by xumeng on 07/03/2018.
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl {
    public String generateToken(String username, String password) {
        return "HELLO MICRO SERVICE";
    }
}
