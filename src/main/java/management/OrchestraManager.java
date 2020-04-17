package management;

import behaviours.IWork;
import players.RankType;

import java.util.Date;

public class OrchestraManager extends OfficeStaff implements IWork {
    private String phoneExtension;

    public OrchestraManager(String name, String jobTitle, RankType position, String phoneExtension, Date startDate) {
        super(name, jobTitle, position, startDate);
        this.phoneExtension = phoneExtension;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }
    public String contract(){
        return "Permanent";
    }

//
}
