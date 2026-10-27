package a2.comparators;
import java.util.Comparator;
import a2.Employee;

public class PayComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = Double.compare(e2.calculatePay(), e1.calculatePay());

        if (result == 0) {
            return e1.getName().compareTo(e2.getName());
        }

        return result;
    }

}
