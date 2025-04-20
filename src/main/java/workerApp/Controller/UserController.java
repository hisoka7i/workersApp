package workerApp.Controller;
// import com.workersapp.entities.User;
// import com.workersapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import workerApp.Entities.User;
import workerApp.Services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

}
