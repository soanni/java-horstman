class A{
	int i,j;

	A(){
		System.out.println("i and j: " + i + " " + j);
		System.out.println("Inside A constructor");	
	}

	void meth(int zz){
		System.out.println("A.meth()");
	}
}

class B extends A{
	int k;

	B(int kk){
		k = kk;
		System.out.println("i and j and k: " + i + " " + j + " " + k);
		System.out.println("Inside B constructor");		
	}

	int meth(int zz){
		System.out.println("B.meth()");
		return 0;
	}
}

class ConstructorsOrder{
	public static void main(String[] args) {
		B bb = new B(12);
		bb.meth("string");
		bb.meth(1);
	}
}