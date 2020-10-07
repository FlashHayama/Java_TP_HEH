package be.isims.coo.tp6.ex2;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AffichageMinute implements ActionListener
{
	public AffichageMinute() { }

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		System.out.println(new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}
