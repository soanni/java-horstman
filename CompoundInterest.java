import java.util.*;

class CompoundInterest{
	public static void main(String[] args) {
		final int NRATES = 6;
		final double START_RATE = 10;
		final int NYEARS = 10;

		double[][] balances = new double[NYEARS][NRATES];
		double[] rates = new double[NRATES];
		for(int i = 0; i < NRATES; i++){
			rates[i] = (START_RATE + i) / 100;
		}

		for(int j = 0; j < balances[0].length; j++){
			balances[0][j] = 10000;
		}

		for(int i = 1; i < NYEARS; i++){
			for(int j = 0; j < NRATES; j++){
				double interest = balances[i-1][j] * rates[j];
				balances[i][j] = balances[i-1][j] + interest;
			}
		}

		//System.out.println(Arrays.toString(rates));
		for(double a : rates)
			System.out.printf("%9.0f%%",a * 100);
		System.out.println();
		for(double[] row : balances){
			System.out.print("[");
			for(double el : row){
				System.out.printf("%10.2f",el);
			}
			System.out.println(" ]");
		}
	}
}