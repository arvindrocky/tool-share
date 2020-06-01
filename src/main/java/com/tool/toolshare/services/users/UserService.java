package com.tool.toolshare.services.users;

import com.tool.toolshare.models.LoginRequest;
import com.tool.toolshare.models.User;

import java.util.List;

public interface UserService{
    public List<User> getUsers();
    public boolean addUser(User user);
    public boolean authenticateUser(LoginRequest request);
}
