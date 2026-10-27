package a2;
import java.util.ArrayList;
import java.util.Collections;
import a2.comparators.PayComparator;

public class CollegeEmployeeSystem {
    //Part 3 — Demonstrate polymorphism
    private ArrayList<Employee> employees;

    public CollegeEmployeeSystem(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void displayAllEmployees(){
        for(Employee e : employees){
            System.out.println(e);
        }
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculatePay();
        }
        return total;
    }

    //Part 5 - Natural ordering with Comparable
    public void sortById() {
        Collections.sort(employees);
    }
    //Part 6 — Alternative ordering with Comparator
    public void sortByPay() {
        Collections.sort(employees, new PayComparator());
    }
}
