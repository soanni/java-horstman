class VarArgs{
	static void vaTest(String msg,int ... v){
		System.out.print(msg + " Number of arguments: " + v.length + " Contents: ");
		for(int x : v){
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VarArgs.vaTest("Message1",10);
		VarArgs.vaTest("Message2",1,2,3);
		VarArgs.vaTest("Message3");
	}
}