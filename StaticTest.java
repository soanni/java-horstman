class Employee{
	private String name;
	private double salary;
	private int id;
	private static int nextId = 0;

	Employee(String n, double s){
		name = n;
		salary = s;
		id = ++nextId;
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public static int getNextId(){
		return nextId;
	}

	public static void main(String[] args){
		// unit testing
		Employee e = new Employee("Tomas",12000);
		System.out.println("Employee name " + e.getName() + ", employee salary " + e.getSalary());
	}
}

class StaticTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Henry", 10000);
		staff[1] = new Employee("Gerald", 11000);
		staff[2] = new Employee("Markus", 12000);

		for(Employee e : staff){
			System.out.println("Employee name " + e.getName() + ", employee salary " + e.getSalary());
		}

		System.out.println("Next available id is " + Employee.getNextId());
	}
}