package com.hortsman.corejava;

import java.time.*;

/**
* This is a {@code Employee} class.
* @author andrey.solodov@aurea.com
* @version 1.0
*/
public class Employee{
	private String name;
	private double salary;
	private LocalDate hireDate;

	/**
	* Class constructor.
	*/
	public Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year,month,day);
	}

	/**
	* getter for name field
	*/
	public String getName(){
		return name;
	}

	/**
	* getter for salary field
	*/
	public double getSalary(){
		return salary;
	}

	/**
	* getter for hireDate field
	*/
	public LocalDate getHireDate(){
		return hireDate;
	}

	/**
	* Raise the salary by percent method.
	*/
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent/100;
		salary += raise;
	}
}