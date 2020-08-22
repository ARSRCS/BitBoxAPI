package services.users;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.user.UserRepository;

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
