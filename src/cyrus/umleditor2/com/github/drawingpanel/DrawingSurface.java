package cyrus.umleditor2.com.github.drawingpanel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import cyrus.umleditor2.com.github.classdiagram.ClassNode;
import cyrus.umleditor2.com.github.drawingpanel.events.SurfaceObserver;

import net.miginfocom.swing.MigLayout;

public class DrawingSurface extends JPanel{
	
	private static final long serialVersionUID = 3786209113916452273L;

	/*
	 * <p>Represents class surface on which drawing takes place</p>
	 */
	Dimension preferredSize = new Dimension(2000,1700);
	
	public ClassNode node=null;
	
	public DrawingSurface()
	{
		this.setLayout(new MigLayout());
		this.setBackground(Color.white);
		this.setPreferredSize(preferredSize);
		registerEvents();
		
	}
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		drawGrid(g2);
		
		if(node!=null){
			node.display(g2);
		}
	}
	public void drawGrid(Graphics2D g2){
		
		/*
		 * @param g2
		 * 		Graphics2D object
		 */
		g2.setColor(new Color(240,240,240));
		
		for(int i=0;i<this.getWidth();i=i+18){	
			g2.drawLine(i, 0, i, this.getHeight());
		}
		
		for(int i=0;i<this.getHeight();i=i+18){	
			g2.drawLine(0, i, this.getWidth(),i);
		}
		
		g2.setColor(new Color(220,220,220));
		
		for(int i=0;i<this.getWidth();i=i+72){	
			g2.drawLine(i, 0, i, this.getHeight());
		}
		
		for(int i=0;i<this.getHeight();i=i+72){	
			g2.drawLine(0, i, this.getWidth(),i);
		}
		
		g2.setColor(Color.black);
	}
	public void registerEvents()
	{
		SurfaceObserver observer = new SurfaceObserver(this);
		this.addMouseListener(observer);
		this.addMouseMotionListener(observer);
	
	}
}
