import domain.Planner;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlannerServiceTest {

    private PlannerService plannerService = new PlannerService();

    @Test
    public void shouldBeAbleToCreateNewPlanner() {
        Planner planner = plannerService.createPlanner();
        assertThat(planner, is(notNullValue()));
    }

    @Test
    public void shouldBeAbleToDeletePlanner() {

    }

    @Test
    public void shouldBeAbleToGetPlannerById() {

    }

    @Test
    public void shouldBeAbleToAddShiftToPlanner() {

    }

    @Test
    public void shouldBeAbleToRemoveShiftFromPlanner() {

    }

}
