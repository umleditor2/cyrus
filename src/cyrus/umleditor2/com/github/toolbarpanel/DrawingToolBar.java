package cyrus.umleditor2.com.github.toolbarpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import org.yaml.snakeyaml.Yaml;

import cyrus.umleditor2.com.github.common.Observer;

public class DrawingToolBar extends JPanel implements ActionListener,
		CommandWidget {
	

	/*
	 * <p>DrawingToolBar class is responsible creating the tool bar that appears over 
	 * the Grid for drawing.</p>
	 */
	private static final long serialVersionUID = -7479194703239496360L;

	private HashMap<String, JToggleButton> buttonMap;

	private URL url;

	private String state;

	private ArrayList<Observer> observers;

	public static String CLASS_TOOLBAR = "conf/classtoolbar.yaml";

	public DrawingToolBar(String conf) {
		/*
		 * @param conf
		 * 		Configuration file for tool bar to be created
		 */
		this.buttonMap = new HashMap<String, JToggleButton>();
		this.url = this.getClass().getClassLoader().getResource(conf);
		this.observers = new ArrayList<Observer>();
		this.initCommandPanel();
	}

	public void initCommandPanel() {

		Yaml yaml = new Yaml();

		try {

			InputStream input = new FileInputStream(this.url.getPath());

			LinkedHashMap<String, ArrayList<String>> config = (LinkedHashMap<String, ArrayList<String>>) yaml
					.load(input);

			for (String key : config.keySet()) {

				ArrayList<String> a = config.get(key);
				this.add(this.createToggleButton(a.get(0), a.get(1)));

			}

		} catch (FileNotFoundException e) {

		}

	}

	public JToggleButton createToggleButton(String name, String iconName) {

		/*
		 * @param name The name of the button
		 * 
		 * @param name of icon associated with the button
		 * 
		 * @return returns a JToggleButton
		 */
		ImageIcon icon;
		try {
			icon = new ImageIcon(ImageIO.read(this.getClass().getClassLoader()
					.getResource("images/" + iconName)));

			JToggleButton button = new JToggleButton(icon);

			button.setName(name);

			button.setToolTipText(name);

			button.setActionCommand(name);

			button.addActionListener(this);

			button.setSize(14, 14);

			buttonMap.put(name, button);

			return button;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * @param e
		 * 		ActionEvent that occured
		 */
		
		for (String s : this.buttonMap.keySet()) {
			if (!e.getActionCommand().equals(s)) {
				this.buttonMap.get(s).setSelected(false);
			}
		}
		if(this.buttonMap.get(e.getActionCommand()).isSelected())
		{
			this.state = e.getActionCommand();
			this.updateState();
		}
		else{
			this.state = "None";
			this.updateState();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		/*
		 * @param observer
		 * 		observer to be added
		 */

		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		/*
		 * @param 
		 * 		observer to be removed
		 */
		this.observers.remove(observer);
	}

	public void updateState() {

		for (Observer o : observers) {
			o.updateState(this.state);
		}
	}

}
