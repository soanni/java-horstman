package interfaces;

import java.util.*;

public class EmployeeSortTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Igor Chechulin", 20000, 2001,1,1);
		staff[1] = new Employee("Alexander Kruglov", 18000, 2000, 1, 1);
		staff[2] = new Manager("Andrey Solodov", 99000, 2012, 11, 7);

		Arrays.sort(staff);

		for(Employee e : staff){
			System.out.println(e);
		}
	}
}