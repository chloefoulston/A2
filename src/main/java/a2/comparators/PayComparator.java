package a2.comparators;
import java.util.Comparator;
import a2.Employee;

public class PayComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) { // compare these 2 objects
        int result = Double.compare(e2.calculatePay(), e1.calculatePay()); // returns a negative number if e1 is first,
        // positive number if e2 should come first, a 0 if they are equal

        if (result == 0) { // another way to sort them if they are equal
            return e1.getName().compareTo(e2.getName()); // like here we chose by name
        }
        return result; // tells java which object should come first
    }

}
