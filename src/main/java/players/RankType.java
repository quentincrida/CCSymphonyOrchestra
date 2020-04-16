package players;

public enum RankType {
    CONCERTMASTER(50000),
    PRINCIPAL(45000),
    SUBPRINCIPAL(40000),
    TUTTI(30000),
    TIER1(45000),
    TIER2(55000),
    TIER3(65000);


    private final int salary;

    RankType(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
