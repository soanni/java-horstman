package inheritance;

public class ManagerTest{
	public static void main(String[] args) {
		Manager boss = new Manager("Andrey Solodov", 250000, 2016, 4, 30);
		boss.setBonus(110500);
		Employee[] arr = new Employee[3];
		arr[0] = boss;
		arr[1] = new Employee("Igor Chechulin", 30000, 2009, 3, 1);
		arr[2] = new Employee("Andrey Borisov", 45000, 2000, 1, 15);

		for(Employee e : arr){
			System.out.println(e);
		} 
	}
}