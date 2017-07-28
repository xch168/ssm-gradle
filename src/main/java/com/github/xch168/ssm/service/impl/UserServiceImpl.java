package com.github.xch168.ssm.service.impl;

import com.github.xch168.ssm.dao.UserDao;
import com.github.xch168.ssm.model.User;
import com.github.xch168.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xch on 2017/1/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User UserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone, state);
    }

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);

    }
}
