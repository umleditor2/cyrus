package cyrus.umleditor2.com.github.elementbase;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TagMap{
	
	HashMap<String,String> hashMap;
	
	public TagMap(){
		this.hashMap = new HashMap<String,String>();
	}
	
	public void clear()
	{
		this.hashMap.clear();
	}
	
	public boolean containsKey(String key)
	{
		return this.hashMap.containsKey(key);
	}
	
	public boolean containsValue(String value)
	{
		return this.hashMap.containsValue(value);
	}
	public String get(String key)
	{
		/*
		 * @return value of the specified key
		 */
		return this.hashMap.get(key);
	}
	public boolean isEmpty()
	{
		/*
		 * @return true if hashMap is empty
		 */
		return this.hashMap.isEmpty();
	}
	public Set<String> keySet()
	{
		/*
		 * @return all keys of hashMap as Set
		 */
		return this.hashMap.keySet();
	}
	public void put(String key, String value)
	{
		/*
		 * @param
		 * 		key to which value is to be associated
		 * @value
		 * 		value to be associated with the key
		 */
		this.hashMap.put(key, value);
	}
	public String remove(String key)
	{
		/*
		 * @param
		 * 		key to be removed
		 */
		return this.hashMap.remove(key);
	}
	public int size()
	{
		/*
		 * @param returns size of this hashMap
		 */
		return this.hashMap.size();
	}
	public Collection<String> values()
	{
		/*
		 * @return values of hashMap as Colleaction
		 */
		return this.hashMap.values();
	}
	
}
