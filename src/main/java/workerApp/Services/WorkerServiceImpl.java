package workerApp.Services;
// import com.workersapp.model.Worker;
// import com.workersapp.repository.WorkerRepository;
// import com.workersapp.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workerApp.Entities.Worker;
import workerApp.Repository.WorkerRepository;

import java.util.List;

import workerApp.Services.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker registerWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public List<Worker> getWorkersBySkill(String skill) {
        return workerRepository.findBySkillsContaining(skill);
    }

    @Override
    public List<Worker> getWorkersByLocation(String location) {
        // return workerRepository.findByCurrentLocation(location);
        return null;
    }
}
