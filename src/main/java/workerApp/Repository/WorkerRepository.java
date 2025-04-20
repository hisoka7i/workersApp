package workerApp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import workerApp.Entities.Worker;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    List<Worker> findBySkillsContaining(String skill);
}
