package services.users;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.user.UserRepository;
@Service
public class LoginUser {

    private UserRepository userRepository;

    @Autowired
    public LoginUser(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User execute(User user){
        return userRepository.login(user);
    }
}
