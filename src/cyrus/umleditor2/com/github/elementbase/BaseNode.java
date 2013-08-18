package cyrus.umleditor2.com.github.elementbase;

import java.awt.Cursor;
import java.awt.Rectangle;

public abstract class BaseNode extends ElementBase{
	
	protected int x;
	
	protected int y;
	
	protected int height;
	
	protected int width;
	
	protected int minHeight;
	
	protected int minWidth;
	
	protected Rectangle bound;
	
	protected String title;

	protected Cursor cursor;
	
	protected TagMap tagMap;
	
}
