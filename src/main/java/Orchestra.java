import behaviours.IPlay;
import behaviours.IWork;
import players.RankType;
import players.strings.Violin1;
import players.woodwinds.Flute;

import java.util.ArrayList;

public class Orchestra {
    private String name;
    private ArrayList<IPlay> instrumentalists;
    private ArrayList<IWork> employees;

    public Orchestra(String name) {
        this.name = name;
        this.instrumentalists = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int musicianCount() {
        return this.instrumentalists.size();
    }

    public void addMusician(IPlay musician) {
        this.instrumentalists.add(musician);
    }

    public void removeMusician(IPlay musician) {
        this.instrumentalists.remove(musician);
    }


    public int employeeCount() {
        return this.employees.size();
    }

    public void addEmployee(IWork employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(IWork employee) {
        this.employees.remove(employee);
    }

    public int totalSalaries(){
        int totalSalaries = 0;
        for(IWork employee : employees){
            totalSalaries += employee.getSalary();
        }
        return totalSalaries;
    }
//    public double averageSalary() {
//        double totalSalaries = 0;
//        double averageSalary = 0;
//        for (IWork employee : employees) {
//            totalSalaries += employee.
//        }
//    }
}