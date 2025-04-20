package workerApp.Controller;
// import com.workersapp.entities.Worker;
// import com.workersapp.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import workerApp.Entities.Worker;
import workerApp.Services.WorkerService;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping("/register")
    public Worker register(@RequestBody Worker worker) {
        return workerService.registerWorker(worker);
    }

    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/skill/{skill}")
    public List<Worker> getWorkersBySkill(@PathVariable String skill) {
        return workerService.getWorkersBySkill(skill);
    }

    @GetMapping("/nearby/{location}")
    public List<Worker> getNearbyWorkers(@PathVariable String location) {
        // return workerService.getWorkersNearLocation(location);
        return null; // not implementing this for now
    }
}
