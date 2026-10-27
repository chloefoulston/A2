package Employees;

import java.util.ArrayList;

public class CollegeEmployeeSystem {
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
}
