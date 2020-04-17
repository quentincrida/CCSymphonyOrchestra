package management;

import behaviours.IWork;
import players.RankType;

public class OrchestraManager extends OfficeStaff implements IWork {
    private String phoneExtension;

    public OrchestraManager(String name, String jobTitle, RankType position, String phoneExtension) {
        super(name, jobTitle, position);
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
