import java.util.*;

public class ConstructorTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Jeff",10000);
		staff[1] = new Employee(11000);
		staff[2] = new Employee();

		for(Employee e : staff){
			System.out.println(e);
		} 	
	}
}

class Employee{
	private static int nextId;
	private int id;
	private String name="";
	private double salary;

	static{
 		nextId = setInitialNextId();
	}

	{
		id = nextId;
		nextId++;
	}

	Employee(){

	}

	Employee(String n, double s){
		name = n;
		salary = s;
	}

	Employee(double s){
		this("Employee #" + nextId, s);
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public String toString(){
		return "Employee's name: " + name + ", salary: " + salary + ", id: " + id;
	}

	private static int setInitialNextId(){
		Random r = new Random();
		return r.nextInt(10000);
	}

}