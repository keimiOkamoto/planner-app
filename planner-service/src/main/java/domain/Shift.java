package domain;

import java.time.Duration;
import java.util.List;

public class Shift {
    private String shiftId;
    private Duration localDate;
    private List<Employee> employees;

    public Shift(String shiftId, Duration localDate, List<Employee> employees) {
        this.shiftId = shiftId;
        this.localDate = localDate;
        this.employees = employees;
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }
}
