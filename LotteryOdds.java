import java.util.*;
import java.math.*;

public class LotteryOdds{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you have to draw? -> ");
		int k = in.nextInt();
		System.out.print("What's the maximum number? -> ");
		int n = in.nextInt();
		BigInteger odds = BigInteger.valueOf(1);
		for(int i = 1; i <= k; i++){
			odds = odds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		}
		System.out.println("Your chances are 1 out of " + odds + ". Good luck!");
	}
}