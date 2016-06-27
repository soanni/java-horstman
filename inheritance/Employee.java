package inheritance;

import java.time.*;

public class Employee{
	private String name;
	private double salary;
	private LocalDate hireDate;

	Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year,month,day);
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
		salary = salary + (salary * byPercent / 100);
	}	

	public String toString(){
		return "Name: " + getName() + ", salary: " + getSalary();
	}
}