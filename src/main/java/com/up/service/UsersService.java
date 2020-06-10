package com.up.service;

import com.up.entity.Users;
import com.up.entity.UsersExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    List<Users> getUser(UsersExample usersExample);
}
