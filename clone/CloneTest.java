package clone;

public class CloneTest
{
	public static void main(String[] args) {
		try
		{
			Employee original = new Employee("Andrey Solodov", 30000);
			original.setHireDay(2012,11,7);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2013,11,7);
			System.out.println("original = " + original);
			System.out.println("copy = " + copy);	
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

	}
}