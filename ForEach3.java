class ForEach3{
	public static void main(String args[]){
		int sum = 0;
		int arr[][] = new int[3][5];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				arr[i][j] = (i+1)*(j+1);
			}
		}

		for(int x[]: arr){
			for(int y: x){
				sum += y;
				System.out.println("Value of y: " + y);
			}
		}

		System.out.println("Sum: " + sum);
	}
}