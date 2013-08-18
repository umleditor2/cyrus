package cyrus.umleditor2.com.github.toolbars;

public abstract class ToolBarFactory {

	public static int CLASS_TOOLBAR = 0;

	public static int STATE_TOOLBAR = 1;

	public static CommandWidget createToolBar(int option) {
		if (option == CLASS_TOOLBAR) {
			return new ClassToolBar();
		} else {
			return null;
		}

	}
}
