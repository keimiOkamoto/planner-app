package domain;

public class Contractor extends Employee {
    public static final EmploymentContractType EMPLOYMENT_CONTRACT_TYPE = EmploymentContractType.CONTRACTOR;

    public Contractor(String id) {
        super(id);
    }
}
