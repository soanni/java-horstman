package enums;

import java.util.*;

public class EnumsTest{
	public static void main(String... args) {
		Scanner	in = new Scanner(System.in);
		System.out.println("Input the size (SMALL,MEDIUM,LARGE,EXTRA_LARGE): ");
		String str = in.next().toUpperCase();
		Size s = Enum.valueOf(Size.class, str);
		System.out.println("size = " + s + ", order = " + s.ordinal() + ", compareTo(Size.LARGE) = " + s.compareTo(Size.LARGE));
		if(s == Size.EXTRA_LARGE){
			System.out.println("Good job!");
		}
	}
}

enum Size{
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	private String abbreviation;
	private Size(String abbreviation){
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation(){
		return abbreviation;
	}
}