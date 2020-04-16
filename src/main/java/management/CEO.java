package management;

import behaviours.IWork;

public class CEO extends OfficeStaff implements IWork {
    private String phoneExtension;

    public CEO(String name, String jobTitle, String phoneExtension) {
        super(name, jobTitle);
        this.phoneExtension = phoneExtension;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }

    public String contract(){
        return "Permanent";
    }
}
