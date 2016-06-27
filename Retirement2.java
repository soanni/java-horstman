import java.util.*;

class Retirement2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much do you expect to deposit (dollars) each year? -> ");
		double payment = in.nextDouble();

		System.out.print("What's the interest rate? -> ");
		double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;
        String answr;
		do{	
			balance += payment;
			double increase = balance * interestRate / 100;
			balance += increase;
			years++;
			
			System.out.printf("Is the balance %,.2f enough to retire (Y/N)? -> ", balance);
			answr = in.next();
		}while(answr.equals("N"));

		System.out.printf("It will take %d years to deposit %,.2f dollars to retire", years, balance);

	}
}