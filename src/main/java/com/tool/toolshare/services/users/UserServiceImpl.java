package com.tool.toolshare.services.users;

import com.tool.toolshare.dao.UserDao;
import com.tool.toolshare.models.LoginRequest;
import com.tool.toolshare.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao userDao;

    @Override
    public boolean authenticateUser(LoginRequest request) {
        return userDao.authenticateUser(request);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
}
