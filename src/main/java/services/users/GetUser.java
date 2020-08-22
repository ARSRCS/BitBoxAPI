package services.users;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.user.UserRepository;

@Service
public class GetUser {

    private UserRepository userRepository;
    @Autowired
    public GetUser(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public User execute(int userId){
        return userRepository.get(userId);
    }
}
