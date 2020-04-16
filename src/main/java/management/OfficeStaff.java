package management;

public abstract class OfficeStaff {
    private String name;
    private String jobTitle;

    public OfficeStaff(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }


}
