package cyrus.umleditor2.com.github.toolbars;

import java.util.ArrayList;

import javax.swing.JToolBar;

public interface CommandWidget {

	public JToolBar createNodeToolBar();
	public JToolBar createEdgeToolBar();
	public JToolBar createMiscToolBar();
	public ArrayList<JToolBar> getToolBar();

}
