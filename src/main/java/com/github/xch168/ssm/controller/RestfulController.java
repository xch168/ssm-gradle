package com.github.xch168.ssm.controller;


import com.github.xch168.ssm.model.User;
import com.github.xch168.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xch on 2017/5/13.
 */
@RestController
@RequestMapping("/api")
public class RestfulController {

    private Logger log = Logger.getLogger(RestfulController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public List<User> hello() {
        List<User> userList = userService.getAllUser();

        log.info("showUser");
        return userList;
    }

}
