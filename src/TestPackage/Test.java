package TestPackage;

import javax.swing.JFrame;

import cyrus.umleditor2.com.github.drawingpanel.DrawingPanel;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		DrawingPanel d = new DrawingPanel();
		frame.add(d);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
