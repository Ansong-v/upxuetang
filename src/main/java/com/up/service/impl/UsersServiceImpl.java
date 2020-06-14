package com.up.service.impl;

import com.up.entity.Users;
import com.up.entity.UsersExample;
import com.up.mapping.UsersMapper;
import com.up.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<Users> getAllUsers() {
        UsersExample usersExample=new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }

    @Override
    public boolean validateUser(String username, String password) {
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria().andNicknameEqualTo(username).andPasswordEqualTo(password);
        List<Users> us=usersMapper.selectByExample(usersExample);
        return us.size()>0?true:false;
    }
}
