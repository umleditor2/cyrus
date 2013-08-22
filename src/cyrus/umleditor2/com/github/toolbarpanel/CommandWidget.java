package cyrus.umleditor2.com.github.toolbarpanel;
import javax.accessibility.Accessible;
import javax.swing.JToggleButton;
import cyrus.umleditor2.com.github.common.Observer;

public interface CommandWidget extends Accessible{

	public void initCommandPanel();
	public JToggleButton createToggleButton(String name, String iconName);
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
}
