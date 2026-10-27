package a2.management;
import a2.interfaces.BonusEligible;

public class ProjectManager extends Manager implements BonusEligible{
    private String projectName;

    public ProjectManager(String employeeId, String name, double baseSalary, String projectName) {
        super(employeeId, name, baseSalary);
        this.projectName = projectName;
    }

    public ProjectManager(ProjectManager other) {
        super(other);
        this.projectName = other.projectName;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.15;
    }

    public String getProjectName() {
        return projectName;
    }
    //Part 4 — User-defined interface
    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.07;
    }

}
