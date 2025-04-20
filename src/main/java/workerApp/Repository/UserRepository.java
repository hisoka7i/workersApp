package workerApp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import workerApp.Entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
