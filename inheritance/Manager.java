package inheritance;

public class Manager extends Employee{
	private double bonus;

	/**
	* @param name the employee's name
	* @param salary the employee's salary
	* @param year year of hire
	* @param month month of hire
	* @param day day of hire
	*/
	Manager(String name, double salary, int year, int month, int day){
		super(name,salary,year,month,day);
		bonus = 0;
	}

	public void setBonus(double bonus){
		this.bonus = bonus;
	}

	public double getSalary(){
		return super.getSalary() + bonus;
		//return super.salary + bonus;
	}
}