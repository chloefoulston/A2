package a2;
import a2.management.DepartmentManager;
import a2.management.ProjectManager;
import a2.faculty.FullTimeFaculty;
import a2.faculty.PartTimeFaculty;
import a2.interfaces.BonusEligible;



public class CollegeEmployeeSystemTest {
    public static void main(String[] args) {

        //Part 3 — Demonstrate polymorphism
        CollegeEmployeeSystem system = new CollegeEmployeeSystem();

        DepartmentManager departmentManager =
                new DepartmentManager("EMP021", "Emma", 5000, "IT");

        ProjectManager projectManager =
                new ProjectManager("EMP452", "James", 6000, "Website Redesign");

        FullTimeFaculty fullTimeFaculty =
                new FullTimeFaculty("EMP003", "Sarah", 4500, 500);

        PartTimeFaculty partTimeFaculty =
                new PartTimeFaculty("EMP074", "Alex", 2000, 300);

        system.addEmployee(departmentManager);
        system.addEmployee(projectManager);
        system.addEmployee(fullTimeFaculty);
        system.addEmployee(partTimeFaculty);

        System.out.println("---All Employees---");
        system.displayAllEmployees();

        System.out.println("---Total Payroll---");
        System.out.println("Total: $" + system.calculateTotalPayroll());

        // Part 4
        BonusEligible b1 = departmentManager;
        BonusEligible b2 = projectManager;

        System.out.println("---Employee Bonuses---");
        System.out.println("Department Manager Bonus: $" + b1.calculateBonus());
        System.out.println("Project Manager Bonus: $" + b2.calculateBonus());

        // Part 8 - Test name tiebreaker when pay is equal
        FullTimeFaculty faculty2 = new FullTimeFaculty("EMP035", "Aaron", 5000, 500);
        system.addEmployee(faculty2);

        //Part 5 — Natural ordering with Comparable

        System.out.println("---Employees Unsorted---");
        system.displayAllEmployees();
        System.out.println("---Employees Sorted by ID---");
        system.sortById();
        system.displayAllEmployees();

        //Part 6 — Alternative ordering with Comparator
        System.out.println("---Employees Sorted by Pay---");
        system.sortByPay();
        system.displayAllEmployees();

        // Part 8 - Test copy constructor and equals()
        System.out.println("---COPY CONSTRUCTOR TEST---");
        DepartmentManager copy = new DepartmentManager(departmentManager);

        System.out.println("Original: " + departmentManager);
        System.out.println("Copy: " + copy);
        System.out.println("Same object: " + (departmentManager == copy));
        System.out.println("Equal: " + departmentManager.equals(copy));
    }
}
