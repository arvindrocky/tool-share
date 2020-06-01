package com.tool.toolshare.controller.users;

import com.tool.toolshare.models.LoginRequest;
import com.tool.toolshare.models.User;
import com.tool.toolshare.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tool-share")
public class UserLoginController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable String userId) {
        // TODO: Return only valid user
        return "UserId is " + userId;
    }

    @PostMapping("/users/authenticate")
    public String authenticateUser(@RequestBody LoginRequest request) {
        boolean isValid = userService.authenticateUser(request);
        return isValid ? "Valid" : "Invalid";
    }
}
