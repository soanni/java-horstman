public class ParamTest{
	public static void main(String[] args) {
		// primitive parameter
		double c = 10;
		System.out.println("Primitive parameter tripple:");
		System.out.println("c before method call: " + c);
		tripple(c);
		System.out.println("c after method call: " + c);
		// obj reference
		System.out.println("Object reference:");
		Employee harry = new Employee("Harry",50000);	
		System.out.println("Harry's salary before method call: " + harry.getSalary());
		harry.trippleSalary();
		System.out.println("Harry's salary after method call: " + harry.getSalary());
		Employee a = new Employee("Alice",25000);
		Employee b = new Employee("Bob",30000);
		System.out.println("Names before swapping a = " + a.getName() +", b = " + b.getName());
		swap(a,b);
		System.out.println("Names after swapping a = " + a.getName() +", b = " + b.getName());
	}

	public static void tripple(double x){
		x *= 3;
		System.out.println("Inside primitive method parameter equals: " + x);
	}

	public static void trippleSalary(Employee x){
		x.trippleSalary();
	}

	public static void swap(Employee x, Employee y){
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x.getName() + " and y = " + y.getName());
	}
}

class Employee{
	private String name;
	private double salary;

	Employee(String n, double s){
		name = n;
		salary = s;
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public void trippleSalary(){
		raiseSalary(200);
	}

	private void raiseSalary(double byPercent){
		double raise = salary * byPercent/100;
		salary += raise;
	}
}