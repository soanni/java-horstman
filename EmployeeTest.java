import java.time.*;

class Employee{
	private final String name;
	private double salary;
	private LocalDate hireDate;

	Employee(String n, double s, int year, int month, int day){
		name = n;
		salary = s;
		hireDate = LocalDate.of(year,month,day);
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public LocalDate getHireDate(){
		return hireDate;
	}

	public void raiseSalary(double byPercent){
		salary = salary * (1 + (byPercent/100));
	}
}

public class EmployeeTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Lewis Hamilton",100000,2012,1,1);
		staff[1] = new Employee("Sebastian Vettel", 150000, 2013,12,25);
		staff[2] = new Employee("Nico Rosberg", 85000, 2010,11,8);

		for(Employee e : staff){
			e.raiseSalary(11);
		}

		for(Employee e : staff){
			System.out.println("Driver " + e.getName() + " has a salary $" + e.getSalary() + " and was hired on " + e.getHireDate());
		}
	}
}