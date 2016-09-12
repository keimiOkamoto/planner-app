import domain.Planner;

import java.util.HashMap;


public class PlannerRepository {

    private static final HashMap plannerRepository = new HashMap();

    public void delete(String id) {
        plannerRepository.remove(id);
    }

    public Planner get(String id) {
        return (Planner) plannerRepository.get(id);
    }

    public void put(Planner planner) {
        plannerRepository.put(planner.getId(), planner);
    }
}
