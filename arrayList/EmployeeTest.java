package arrayList;

import java.util.*;

public class EmployeeTest{
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Manager("Andrey Solodov",100000,2016,5,1));
		staff.add(new Employee("Igor Chechulin",90000,2006,1,1));
		staff.add(new Employee("Alexander Kruglov",80000,2005,1,1));
		for(Employee e : staff){
			e.raiseSalary(5);
		}
		Manager boss = (Manager) staff.get(0);
		boss.setBonus(15000);

		for(Employee e : staff){
			System.out.println(e);
		}
	}
}