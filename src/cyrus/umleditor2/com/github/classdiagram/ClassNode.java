package cyrus.umleditor2.com.github.classdiagram;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

import cyrus.umleditor2.com.github.elementbase.BaseNode;
import cyrus.umleditor2.com.github.elementbase.ElementBase;


public class ClassNode extends BaseNode {

	private int mutateX;

	private int mutateY;
	
	private static final Color FILL_COLOR = Color.cyan;
	
	private static final Color BORDER_COLOR = Color.darkGray;

	public ClassNode(int x, int y) {
		/*
		 * @param x x axis of class
		 * 
		 * @param y y axis of class
		 */
		this.width = 150;
		this.height = 60;
		this.minWidth = 150;
		this.minHeight = 60;
		this.x = x;
		this.y = y;
	}

	@Override
	public void display(Graphics2D g2) {

		if (this.width <= this.minWidth) {
			this.width = this.minWidth;
		}
		if (this.height <= this.minHeight) {
			this.height = this.minHeight;
		}
		
		g2.setColor(FILL_COLOR);
		g2.fillRect(this.x, this.y, this.width, this.height);
		g2.setColor(BORDER_COLOR);
		g2.drawRect(this.x, this.y, this.width, this.height);
		

	}

	@Override
	public JPopupMenu getPopUpMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hovered(MouseEvent e, Graphics2D g2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cursor getCursor(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void drawSelectionAppearence() {
		// TODO Auto-generated method stub

	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateView() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVRB(Rectangle r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setReference(ElementBase EI) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setParent(ElementBase panel) {
		// TODO Auto-generated method stub

	}

}
