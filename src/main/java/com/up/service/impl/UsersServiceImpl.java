package com.up.service.impl;

import com.up.entity.Users;
import com.up.entity.UsersExample;
import com.up.mapping.UsersMapper;
import com.up.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<Users> getUser(UsersExample usersExample) {
        return usersMapper.selectByExample(usersExample);
    }
}
