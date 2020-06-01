package com.tool.toolshare.dao;

import com.tool.toolshare.models.LoginRequest;
import com.tool.toolshare.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User getUser() {
        // TODO: Need to implement
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> usersList = jdbcTemplate.query("SELECT userId, userName, firstName, lastName, password FROM users", (resultSet, rowNumber) ->
                new User(resultSet.getInt("userId"), resultSet.getString("userName"), resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("password")));
        return usersList;
    }

    @Override
    public boolean addUser(User user) {
        try {
            jdbcTemplate.update("INSERT INTO users(userName, firstName, lastName, password) VALUES(?, ?, ?, ?)", user.getUserName(), user.getFirstName(), user.getLastName(), user.getPassword());
        }
        catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    public boolean authenticateUser(LoginRequest request) {
        List<User> usersList =
                jdbcTemplate.query("SELECT userId, firstName, lastName, password FROM users WHERE userName = ?", new Object[]{request.getUserName()}, (resultSet, rowNumber) ->
                        new User(resultSet.getInt("userId"), request.getUserName(), resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("password")));
        if (usersList.size() > 0) {
            return request.getPassword().equals(usersList.get(0).getPassword());
        }
        return false;
    }
}
