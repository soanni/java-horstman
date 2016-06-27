package timer;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class TimePrinter implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("The time is " + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}