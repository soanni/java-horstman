import java.util.*;

/**
	InputTest
*/
public class InputTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("What's your age?");
		int age = in.nextInt();

		System.out.println("My name is " + name + ". I'm " + age + " years old.");
	}
}