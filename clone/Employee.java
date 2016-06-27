package clone;

import java.util.*;

public class Employee implements Cloneable
{
	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		this.hireDay = new Date();
	}

	public void setHireDay(int year, int month, int day)
	{
		hireDay.setTime(new GregorianCalendar(year, month - 1, day).getTime().getTime());
	}

	public void raiseSalary(double byPercent)
	{
		double increase = salary * byPercent / 100;
		salary += increase;
	}

	public String toString()
	{
		return "Employee[ name = " + name + ", salary = " + salary + ", hireDay = " + hireDay + " ]";
	}

	public Employee clone() throws CloneNotSupportedException
	{
		Employee copy = (Employee) super.clone();
		copy.hireDay = (Date) hireDay.clone();
		return copy;
	}
}