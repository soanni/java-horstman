package lambda;

import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

public class LambdaTest
{
	public static void main(String[] args)
	{
		String[] arr = new String[] {"Earth", "Mars", "Pluto", "Uranium", "Venice", "Mercury"};
		System.out.println("An unsorted array of strings: ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Alphabetically sorted array of strings: ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, (first,second)->first.length()-second.length());
		System.out.println("Array of strings sorted by length: ");
		System.out.println(Arrays.toString(arr));
		Timer t = new Timer(3000,event->System.out.println("The time is " + new Date()));
		t.start();
		JOptionPane.showMessageDialog(null,"Exit?");
		System.exit(0);
	}
}