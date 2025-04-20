package workerApp.Services;

import java.util.List;

import workerApp.Entities.Worker;

public interface WorkerService {
    public List<Worker> getWorkersByLocation(String location);
    public List<Worker> getWorkersBySkill(String skill);
    public List<Worker> getAllWorkers();
    public Worker registerWorker(Worker worker);
}
