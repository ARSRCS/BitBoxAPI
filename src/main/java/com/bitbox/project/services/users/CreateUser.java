package com.bitbox.project.services.users;

import com.bitbox.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.user.UserRepository;

@Service
public class CreateUser {

    private UserRepository userRepository;
    @Autowired
    public CreateUser(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void execute(User user){
                userRepository.add(user);
    }
}
