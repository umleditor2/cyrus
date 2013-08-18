package cyrus.umleditor2.com.github.toolbars;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class ClassToolBar implements CommandWidget,ActionListener {

	/*
	 * <p>List of toolbars that is to be displayed on the drawing panel. This
	 * class is responsible for creating the toolbar for the class diagram. The
	 * purpose is to return the array of toolbars.
	 */
	ArrayList<JToolBar> toolBarList = new ArrayList<JToolBar>();

	private static String state;

	public ClassToolBar() {
		toolBarList.add(createNodeToolBar());
		toolBarList.add(createEdgeToolBar());
		toolBarList.add(createMiscToolBar());
		
	}

	public JToolBar createNodeToolBar() {
		/*
		 * @return JToolBar containing options for drawing Nodes for class
		 * diagram
		 */

		JToolBar toolbar = new JToolBar();

		JButton classNode = new JButton("Class");

		classNode.addActionListener(this);

		classNode.setName(classNode.getActionCommand());
		
		JButton enumNode = new JButton("Enum");

		enumNode.addActionListener(this);

		enumNode.setName(enumNode.getActionCommand());
		
		JButton interfaceNode = new JButton("Inteface");

		interfaceNode.addActionListener(this);

		interfaceNode.setName(interfaceNode.getActionCommand());
		
		JButton primitiveNode = new JButton("Primitive");

		primitiveNode.addActionListener(this);

		primitiveNode.setName(primitiveNode.getActionCommand());
		toolbar.add(classNode);
		toolbar.add(enumNode);
		toolbar.add(interfaceNode);
		toolbar.add(primitiveNode);

		return toolbar;
	}

	public JToolBar createEdgeToolBar() {
		/*
		 * @return JToolBar containing options for drawing edges for class
		 * diagram
		 */

		JToolBar toolbar = new JToolBar();
		JButton generalization = new JButton("Generalization");
		generalization.addActionListener(this);
		generalization.setName(generalization.getActionCommand());

		JButton realization = new JButton("Realization");
		realization.addActionListener(this);
		realization.setName(realization.getActionCommand());

		JButton association = new JButton("Association");
		association.addActionListener(this);
		association.setName(association.getActionCommand());

		toolbar.add(generalization);
		toolbar.add(realization);
		toolbar.add(association);

		return toolbar;
	}

	public JToolBar createMiscToolBar() {
		/*
		 * @return JToolBar containing misc options for class diagram that is
		 * notes, selection tool and connectors
		 */

		JToolBar toolbar = new JToolBar();

		JToggleButton selection = new JToggleButton("Marquee");
		selection.addActionListener(this);
		selection.setName(selection.getActionCommand());

		JButton connector = new JButton("Connector");
		connector.addActionListener(this);
		connector.setName(connector.getActionCommand());

		JButton note = new JButton("Note");
		note.addActionListener(this);
		note.setName(note.getActionCommand());

		toolbar.add(selection);
		toolbar.add(connector);
		toolbar.add(note);

		return toolbar;

	}

	public ArrayList<JToolBar> getToolBar() {
		/*
		 * @return list of toolbars
		 */
		return this.toolBarList;
	}

	public void actionPerformed(ActionEvent e) {
		
		//setButtonState(true," ");
		
		state = e.getActionCommand();

		if (state.equals("Marquee")&&((JToggleButton)e.getSource()).isSelected()) {
			setButtonState(false, "Marquee");
		}
		else{
			setButtonState(true,"dummy");
		}

	}

	public void setButtonState(boolean b, String immune) {
		/*
		 * @param b boolean value to suggest whether to select or unselect
		 * 
		 * @param immune button to which the current logic does not apply
		 */
		for (JToolBar toolbar : toolBarList) {
	
			for(Component component: toolbar.getComponents())
			{
				if(!component.getName().equals(immune))
				{
					component.setEnabled(b);
				}
				
			}	
		}
	}
}
