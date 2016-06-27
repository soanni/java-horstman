class Outer{
	int outer_x = 10;

	void test(){
		Inner y = new Inner();
		y.display();
	}

	class Inner{
		void display(){
			System.out.println("outer_x: " + outer_x);
		}
	}
}

class InnerClassDemo{
	public static void main(String[] args) {
		Outer z = new Outer();
		z.test();
	}
}