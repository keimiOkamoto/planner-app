import domain.Planner;
import domain.Shift;


public class PlannerService {

    private PlannerRepository plannerRepository = new PlannerRepository();

    public Planner createPlanner() {
        Planner planner = new Planner(IdGenerator.getId());
        plannerRepository.put(planner);
        return planner;
    }

    public void delete(String id) {
        plannerRepository.delete(id);
    }

    public Planner getPlannerBy(String id) {
        return plannerRepository.get(id);
    }

    public void addShift(Shift shift) {
    }
}
