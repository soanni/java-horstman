import java.util.*;
/**
	LotteryDrawing.class
*/
public class LotteryDrawing{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What's the number you have to draw? -> ");
		int k = in.nextInt();
		System.out.print("What's the maximum number? -> ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = i+1;
		}

		int[] result = new int[k];
		for(int i = 0; i < k; i++){
			int r = (int) (Math.random() * n);
			result[i] = arr[r];
			arr[r] = arr[n-1];
			n--;
		}

		// sorting
		Arrays.sort(result); 
		System.out.print("Bet on these numbers: ");
		System.out.print(Arrays.toString(result));
	}
}