public class LotteryArray{
	public static void main(String[] args) {
		final int NMAX = 10;

		int[][] arr = new int[NMAX+1][];
		for(int i = 0; i <= NMAX; i++){
			arr[i] = new int[i+1];
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				int odds = 1;
				for(int k = 1; k <= j; k++){
					odds = odds * (i-k+1)/k;
				}
				arr[i][j] = odds;
			}
		}

		for(int[] row : arr){
			for(int el : row){
				System.out.printf("%4d",el);
			}
			System.out.println();
		}
	}
}