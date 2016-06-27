import java.util.*;

class Retirement{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much do you expect to deposit (dollars) each year? -> ");
		double payment = in.nextDouble();
		//System.out.println();

		System.out.print("What's the interest rate? -> ");
		double interestRate = in.nextDouble();
		//System.out.println();

		System.out.print("What's your goal? -> ");
		double goal = in.nextDouble();
		//System.out.println();

		double balance = 0;
		int years = 0;

		while(balance < goal){
			balance += payment;
			double increase = balance * interestRate / 100;
			balance += increase;
			years++;
		}

		System.out.printf("It will take %d years to deposit %,.2f dollars to retire", years, balance);

	}
}