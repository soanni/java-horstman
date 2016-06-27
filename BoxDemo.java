class Box{
	double width;
	double height;
	double depth;
}

class BoxDemo{
	public static void main(String args[]){
		Box myBox = new Box();
		double vol;
		myBox.width = 10;
		myBox.height = 12;
		myBox.depth = 11;
		vol = myBox.width * myBox.height * myBox.depth;
		System.out.println("Volume is " + vol);
	}
}