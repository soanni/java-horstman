class Box{
	private double width;
	private double height;
	private double depth;

	Box(Box obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
		System.out.println("Calling Box constructor");
	}

	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		System.out.println("Calling Box constructor");
	}

	Box(double length){
		width = height = depth = length;
		System.out.println("Calling Box constructor");
	}

	Box(){
		width = height = depth = -1;
		System.out.println("Calling Box constructor");
	}

	double volume(){
		return width * height * depth;
	}
}

class BoxWeight extends Box{
	double weight;

	BoxWeight(BoxWeight obj){
		super(obj);
		weight = obj.weight;
		System.out.println("Calling BoxWeight constructor");
	}

	BoxWeight(double w, double h, double d, double wh){
		super(w,h,d);
		weight = wh;
		System.out.println("Calling BoxWeight constructor");
	}

	BoxWeight(double length, double wh){
		super(length);
		weight = wh;
		System.out.println("Calling BoxWeight constructor");
	}

	BoxWeight(){
		super();
		weight = -1;
		System.out.println("Calling BoxWeight constructor");
	}
}

class Shipment extends BoxWeight{
	double cost;

	Shipment(Shipment obj){
		super(obj);
		System.out.println("Calling Shipment constructor");
	}

	Shipment(double w, double h, double d, double wh, double c){
		super(w,h,d,wh);
		System.out.println("Calling Shipment constructor");
		cost = c;	
	}

	Shipment(double length, double wh, double c){
		super(length,wh);
		cost = c;
		System.out.println("Calling Shipment constructor");
	}

	Shipment(){
		super();
		cost = -1;
		System.out.println("Calling Shipment constructor");
	}
}

class DemoShipment{
	public static void main(String[] args) {
		Shipment sh = new Shipment(10,2,3,4,5);
		double vol = sh.volume();
		Shipment sh1 = new Shipment(sh);
		double vol1 = sh1.volume();

		System.out.println("sh vol: " + vol);
		System.out.println("sh1 vol: " + vol1);
	}
}