package com.pjh.admin.impl;

import com.pjh.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 新增用户
     * @param name
     * @param age
     */
    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into user(id,username) values(?, ?)", "1",name);
    }

}
