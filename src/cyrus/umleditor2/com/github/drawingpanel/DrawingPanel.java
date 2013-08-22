package cyrus.umleditor2.com.github.drawingpanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import net.miginfocom.swing.MigLayout;
import cyrus.umleditor2.com.github.toolbarpanel.DrawingToolBar;

public class DrawingPanel extends JPanel {

	/*
	 * <p>DrawingPanel class contains commandWidget that is the toolbar for
	 * drawing option. DrawingSplitPane that contains drawingPanel and
	 * detail.</p>
	 */

	private static final long serialVersionUID = 1643867011152689825L;

	private DrawingToolBar drawingToolBar;

	private DrawingSplitPane splitPane;

	public DrawingPanel() {
		this.setLayout(new MigLayout());
		configCommandWidget();
		configSplitPane();
		linkCommand2Surface();
	}

	public void configCommandWidget() {
		/*
		 * <p>Sets toolbar</p>
		 */
		this.drawingToolBar = new DrawingToolBar(DrawingToolBar.CLASS_TOOLBAR);

		this.add(this.drawingToolBar,"w 100%, wrap");
	}

	public void configSplitPane() {
		this.splitPane = new DrawingSplitPane();
		this.add(splitPane, "w 100%,h 100%");

	}

	public void linkCommand2Surface() {

		JScrollPane scroll = (JScrollPane) this.splitPane.getTopComponent();

		JViewport view = scroll.getViewport();

		this.drawingToolBar.registerObserver((DrawingSurface) scroll
				.getViewport().getView());
	}

}
