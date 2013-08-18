package cyrus.umleditor2.com.github.drawingpanel.events;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import cyrus.umleditor2.com.github.classdiagram.ClassNode;
import cyrus.umleditor2.com.github.drawingpanel.DrawingSurface;



public class SurfaceObserver implements MouseListener, MouseMotionListener{

	DrawingSurface source;
	
	Point p;
	
	public SurfaceObserver(DrawingSurface source)
	{
		/*
		 * @param source
		 * 		the source of the event
		 */
		p = new Point();
		
		this.source = source;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		p.x = e.getX();
		p.y = e.getY();
		
		source.node=new ClassNode(e.getX()-75, e.getY()-30);
		update();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		updateSurface(e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void updateSurface(MouseEvent e){
		
		int tmpx=source.getX()+(-1*(p.x-e.getX()));
		int tmpy=source.getY()+(-1*(p.y-e.getY()));	
		changePanelSize();
		if(tmpx>0){tmpx=0;}
		if(tmpy>0){tmpy=0;}
		source.setLocation(new Point(tmpx,tmpy));
		update();
	}
	
	public void update(){
		source.revalidate();
		source.repaint();
	}
	public void changePanelSize(){
		
		if(source.getX()+source.getPreferredSize().width==source.getVisibleRect().width
				   ||source.getY()+source.getPreferredSize().height==source.getVisibleRect().height){
					source.setPreferredSize(new Dimension(source.getPreferredSize().width+50,
													source.getPreferredSize().height+25));
				}
	}
	
}
