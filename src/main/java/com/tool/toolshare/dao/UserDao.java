package com.tool.toolshare.dao;

import com.tool.toolshare.models.LoginRequest;
import com.tool.toolshare.models.User;

import java.util.List;

public interface UserDao {
    User getUser();
    List<User> getAllUsers();
    boolean addUser(User user);
    boolean authenticateUser(LoginRequest request);
}
