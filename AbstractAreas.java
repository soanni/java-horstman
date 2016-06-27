abstract class Figure{
	double dim1, dim2;

	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a,b);
	}

	double area(){
		System.out.println("Inside Rectangle's area()");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}

	double area(){
		System.out.println("Inside Triangle's area()");
		return dim1*dim2/2;
	}
}

class AbstractAreas{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,11);
		Triangle t = new Triangle(10,11);

		Figure f;

		f = r;
		System.out.println("Area is: " + f.area());

		f = t;
		System.out.println("Area is: " + f.area());
	}
}

