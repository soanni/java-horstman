package timer;

import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimerTest{
	public static void main(String[] args) {
		ActionListener a = new TimePrinter();
		Timer t = new Timer(10000,a);
		t.start();
		JOptionPane.showMessageDialog(null,"Exit?");
		System.exit(0);
	}
}