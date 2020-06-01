package com.tool.toolshare.controller.users;

import com.tool.toolshare.models.User;
import com.tool.toolshare.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tool-share")
public class UserRegistrationController {
    @Autowired
    UserService userService;

    @PostMapping("/users")
    public boolean registerUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
