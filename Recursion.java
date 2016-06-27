class Factorial{
	int fact(int n){
		if(n == 1) return 1;
		return fact(n-1)*n;
	}
}

class Recursion{
	public static void main(String args[]){
		Factorial f = new Factorial();
		System.out.println("Factorial of 3: " + f.fact(3));
		System.out.println("Factorial of 4: " + f.fact(4));
		System.out.println("Factorial of 10: " + f.fact(10));
	}
}