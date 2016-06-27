class RecTest{
	int arr[];
	RecTest(int i){
		arr = new int[i];
		for(int j = 0; j < i; j++)
			arr[j] = j;
	}

	void printArray(int i){
		if(i == 0) return;
		else printArray(i-1);
		System.out.println("[" + (i - 1) + "]: " + arr[i-1]);	
	}
}

class Recursion2{
	public static void main(String args[]){
		RecTest rt = new RecTest(10);
		rt.printArray(10);
	}
}