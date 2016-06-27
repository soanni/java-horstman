package abstractClasses;

public class AbstractTest{
	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Student("Artem Solodov","mechanics");
		people[1] = new Employee("Andrey Solodov", 150000, 2016, 6, 1);
		for(Person p : people){
			System.out.println("Name: " + p.getName() + ", description: " + p.getDescription());
		}
	}
}