package management;

import behaviours.IWork;
import players.RankType;

import java.util.Date;

public abstract class OfficeStaff implements IWork {
    private String name;
    private String jobTitle;
    private RankType position;
    private Date startDate;



    public OfficeStaff(String name, String jobTitle, RankType position, Date startDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.position = position;
        this.startDate = startDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public int getSalary(){
        return this.position.getSalary();
    }

}




