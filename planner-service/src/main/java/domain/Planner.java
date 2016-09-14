package domain;

public class Planner {
    private String id;

    private String companyName;

    public Planner(String id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }
}
