package cyrus.umleditor2.com.github.drawingpanel;



import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JToolBar;

import cyrus.umleditor2.com.github.toolbars.ToolBarFactory;

import net.miginfocom.swing.MigLayout;

public class DrawingPanel extends JPanel{
	
	/*
	 * <p>DrawingPanel class contains commandWidget that is the toolbar 
	 * for drawing option. DrawingSplitPane that contains drawingPanel
	 * and detail.</p>
	 */
	
	private static final long serialVersionUID = 1643867011152689825L;

	private JPanel commandWidget = new JPanel(new MigLayout());

	private DrawingSplitPane splitPane = new DrawingSplitPane();
	
	
	public DrawingPanel()
	{
		this.setLayout(new MigLayout());
		configCommandWidget();
		configSplitPane();
	}

	public void configCommandWidget(){
		/*
		 * <p>Sets toolbar</p>
		 */
		//ArrayList<JToolBar> list = new ClassToolBar().getToolBar();
		ArrayList<JToolBar> list = ToolBarFactory.createToolBar(ToolBarFactory.CLASS_TOOLBAR).getToolBar();
		commandWidget.setBackground(Color.darkGray);
		commandWidget.add(list.get(0));
		commandWidget.add(list.get(1));
		commandWidget.add(list.get(2));
		this.add(commandWidget,"w 100%, wrap");
	}
	public void configSplitPane()
	{
		this.add(splitPane,"w 100%,h 100%");
	}
}
