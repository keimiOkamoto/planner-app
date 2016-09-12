package domain;

import java.time.LocalDate;

public abstract class Employee {
    private String id;
    private String name;
    private LocalDate dob;
    private String employmentStartDate;
    private EmploymentContractType employmentContractType;

    public Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(String employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public EmploymentContractType getEmploymentContractType() {
        return employmentContractType;
    }

    public void setEmploymentContractType(EmploymentContractType employmentContractType) {
        this.employmentContractType = employmentContractType;
    }
}
