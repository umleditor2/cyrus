package cyrus.umleditor2.com.github.drawingpanel;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;

public class DrawingSplitPane extends JSplitPane{
	/*
	 * <p>This class contains two panels. One panel containing
	 * drawing interactive capabilities. The other panel containing
	 * detail features of a diagram.</p>
	 */
	
	/*
	 * <p>Drawing surface represents the grid on which the drawing
	 * takes place.</p>
	 */
	private static final long serialVersionUID = 6236134253448715533L;

	DrawingSurface surface = new DrawingSurface();
	
	/*
	 * <p>DetailPanel represents detailed info of an element based
	 * on user selection</p>
	 */
	DetailPanel detail = new DetailPanel();
	
	/*
	 * <p>Scroll pane that shall contain the drawing surface.</p>
	 */
	JScrollPane scroll = new JScrollPane();
	
	public DrawingSplitPane()
	{
		/*
		 * <p>Set orientation of the split pane.</p>
		 */
		this.setOrientation(JSplitPane.VERTICAL_SPLIT);
		this.setDividerSize(5);
		this.setResizeWeight(0.9);
		this.setTopComponent(scroll);
		this.setBottomComponent(detail);
		configScrollPane();
		
	}
	
	public void configScrollPane(){
		/*
		 * <p>Set settings for scroll pane</p>
		 */
		 setAutoscrolls(true);
		 scroll.setViewportView(this.surface);
		 scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		 scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}

}
