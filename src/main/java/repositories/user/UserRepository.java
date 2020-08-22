package repositories.user;

import models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void add(User user);
    void delete(int userId);
    void update(int userId,User updatedUser);
    User get(int userId);
    User login(User user);
}
