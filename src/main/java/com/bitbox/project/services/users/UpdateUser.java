package com.bitbox.project.services.users;

import com.bitbox.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.user.UserRepository;

@Service
public class UpdateUser {

    private UserRepository userRepository;

    @Autowired
    public UpdateUser(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void execute(int userId, User updatedUser){
        userRepository.update(userId,updatedUser);
    }

}
