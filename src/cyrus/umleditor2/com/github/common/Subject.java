package cyrus.umleditor2.com.github.common;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);

}
