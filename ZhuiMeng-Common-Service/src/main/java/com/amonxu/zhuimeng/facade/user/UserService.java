package com.amonxu.zhuimeng.facade.user;

/**
 * Created by xumeng on 07/03/2018.
 */
public interface UserService {

    public String generateToken(String username, String password);
}
