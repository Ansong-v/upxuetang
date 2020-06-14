package com.up.service;

import com.up.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    List<Users> getAllUsers();

    boolean validateUser(String uname, String pwd);

}
