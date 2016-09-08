import domain.Planner;

public class PlannerService {

    public Planner createPlanner() {
        return new Planner(IdGenerator.getId());
    }
}
