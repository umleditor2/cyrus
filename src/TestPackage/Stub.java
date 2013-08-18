package TestPackage;


import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import cyrus.umleditor2.com.github.drawingpanel.DrawingPanel;
import cyrus.umleditor2.com.github.toolbars.ClassToolBar;

public class Stub extends JFrame
{
	private DrawingPanel panel=new DrawingPanel();
	
	Stub()
	{

		this.setSize(UEUtilities.getScreenSize(this).width,UEUtilities.getScreenSize(this).height);
		
		this.setTitle("Cyrus");
		
		this.setVisible(true);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new Stub();
	}
}
