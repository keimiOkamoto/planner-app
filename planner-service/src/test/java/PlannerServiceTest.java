import domain.Planner;
import domain.Shift;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlannerServiceTest {

    private PlannerService plannerService = new PlannerService();
    private PlannerRepository plannerRepository = new PlannerRepository();

    @Test
    public void shouldBeAbleToCreateNewPlanner() {
        Planner planner = plannerService.createPlanner();
        assertThat(planner, is(notNullValue()));
    }

    @Test
    public void shouldBeAbleToDeletePlanner() {
        Planner planner = plannerService.createPlanner();
        String id = planner.getId();
        plannerService.delete(id);

        Assert.assertNull(plannerRepository.get(id));
    }

    @Test
    public void shouldBeAbleToGetPlannerById() {
        Planner expectedPlanner = plannerService.createPlanner();
        String id = expectedPlanner.getId();

        Planner actualPlanner = plannerService.getPlannerBy(id);

        assertThat(expectedPlanner.getId(), is(equalTo(actualPlanner.getId())));
    }

    @Test
    public void shouldBeAbleToAddShiftToPlanner() {
        Shift shift = new Shift("someID", Duration.ZERO, Collections.singletonList(new Contractor("123")));
        plannerService.addShift(shift);

    }

    @Test
    public void shouldBeAbleToRemoveShiftFromPlanner() {

    }

}
