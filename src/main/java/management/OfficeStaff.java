package management;

import behaviours.IWork;
import players.RankType;

public abstract class OfficeStaff implements IWork {
    private String name;
    private String jobTitle;
    private RankType position;



    public OfficeStaff(String name, String jobTitle, RankType position) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public RankType getRank(){
        return this.position;
    }

    public int getSalaryFromEnum(){
        return this.position.getSalary();
    }

    public int getSalary(){
        return this.getSalaryFromEnum();
    }

}




