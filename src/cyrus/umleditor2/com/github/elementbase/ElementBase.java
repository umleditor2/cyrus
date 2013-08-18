package cyrus.umleditor2.com.github.elementbase;

import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;


import javax.swing.JPopupMenu;

public abstract class ElementBase {
	
		public abstract void display(Graphics2D g2);
		public abstract JPopupMenu getPopUpMenu();
		public abstract void hovered(MouseEvent e,Graphics2D g2);
		public abstract void pressed(MouseEvent e);
		public abstract void dragged(MouseEvent e);
		public abstract void reset();
		public abstract Cursor getCursor(int a, int b);
		public abstract boolean contains(Point p);
		public abstract void drawSelectionAppearence();
		public abstract Rectangle getBounds();
		public abstract boolean updateView();
		public abstract void setVRB(Rectangle r);
		public abstract void setReference(ElementBase EI);
		public abstract void setParent(ElementBase panel);
	
}
