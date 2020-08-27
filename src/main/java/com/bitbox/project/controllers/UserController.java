package com.bitbox.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bitbox.project.services.users.*;
import com.bitbox.project.models.User;

@CrossOrigin(origins="*")
@RestController
public class UserController {
    private CreateUser createUser;
    private DeleteUser deleteUser;
    private UpdateUser updateUser;
    private GetUser getUser;
    private LoginUser loginUser;

    @Autowired
    public UserController(CreateUser createUser, DeleteUser deleteUser, UpdateUser updateUser, GetUser getUser, LoginUser loginUser){
        this.createUser=createUser;
        this.deleteUser=deleteUser;
        this.updateUser=updateUser;
        this.getUser=getUser;
        this.loginUser=loginUser;
    }

    @ResponseBody
    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        createUser.execute(user);
    }
    @ResponseBody
    @PostMapping("/updateUser/{id}")
    public void updateUser(@PathVariable("id") int userId, @RequestBody User updatedUser){
        updateUser.execute(userId,updatedUser);
    }
    @ResponseBody
    @PostMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int userId){
        deleteUser.execute(userId);
    }
    @ResponseBody
    @PostMapping("/loginUser/{id}")
    public User loginUser(@RequestBody User user){
        return loginUser.execute(user);
    }
    @ResponseBody
    @GetMapping("users/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return getUser.execute(userId);
    }
}
