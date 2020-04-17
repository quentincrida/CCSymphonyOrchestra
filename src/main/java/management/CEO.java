package management;

import behaviours.IWork;
import players.RankType;

import java.util.Date;

public class CEO extends OfficeStaff implements IWork {
    private String phoneExtension;

    public CEO(String name, String jobTitle, String phoneExtension, RankType position) {
        super(name, jobTitle, position);
        this.phoneExtension = phoneExtension;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }

    public String contract() {
        return "Permanent";
    }


//
}
