class Outer{
	int outer_x = 10;

	void test(){
		for(int i = 0; i < 10; i++){
			class Inner{
				void display(){
					System.out.println("outer_x: " + outer_x);
				}
			}

			Inner inn = new Inner();
			inn.display();	
		}
	}
}

class InnerClassDemo2{
	public static void main(String[] args) {
		Outer z = new Outer();
		z.test();
	}
}