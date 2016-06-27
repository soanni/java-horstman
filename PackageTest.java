import com.hortsman.corejava.Employee;
import static java.lang.System.*;

public class PackageTest{
	public static void main(String[] args) {
		Employee harry = new Employee("Harry", 37500, 2016,4,30);
		harry.raiseSalary(15);
		out.println("Name: " + harry.getName() + ", salary: " + harry.getSalary());
	}
}