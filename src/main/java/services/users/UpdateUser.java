package services.users;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.user.UserRepository;

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
