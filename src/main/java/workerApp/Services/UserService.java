package workerApp.Services;


import java.util.List;
import java.util.Optional;

import workerApp.Entities.User;
public interface UserService {
    public User registerUser(User user);
    public Optional<User> getUserById(Long id);
}
