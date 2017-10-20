package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Debug模式下，能热部署Springboot
 * Created by mac on 17/10/20.
 */
@RestController
public class SpringBootTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public Object hello(){
        logger.info("tes2222HHHHH222HH2222HH");
        return userMapper.findUser();
    }
}
