package com.github.xch168.ssm.service;


import com.github.xch168.ssm.model.User;

import java.util.List;

/**
 * Created by xch on 2017/1/14.
 */
public interface UserService {

    List<User> getAllUser();

    User UserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

}
