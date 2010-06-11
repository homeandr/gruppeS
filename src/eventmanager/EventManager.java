/**
 * 
 */
package eventmanager;

import messages.*;
import java.util.Hashtable;
import java.lang.Thread;

/**
 * @author clemens
 * 
 * Der Event Manager ist 
 * 
 * Histroy
 * 		11.6.2010	-cm		-Inital Version
 *
 */
public class EventManager extends Thread {
	private Hashtable constructedMessages;
	private Hashtable registeredListeners;
	
	/**
	 * 
	 */
	public EventManager()
	{
		this.constructedMessages = new Hashtable();
		this.registeredListeners = new Hashtable();
	}
	
/*	private Class createClass(int id)
	{
		return new Class();
	}*/
	
	/**
	 * @param message
	 * @param listener
	 */
	public void deleteListener(Message message, ListenerInterface listener)
	{
		
	}
	
	/**
	 * @param id
	 * @param listener
	 */
	public void deleteListener(int id, ListenerInterface listener)
	{
		
	}
	
	/**
	 * @param message
	 */
	public void fireMessage(Message message)
	{
		
	}
	
	/**
	 * @param id
	 * @param data
	 */
	public void fireMessage(int id, Object data)
	{
		
	}
	
	/**
	 * @param message
	 * @param listener
	 */
	public void registerListener(Message message, ListenerInterface listener)
	{
		
	}
	
	/**
	 * @param message
	 * @param listener
	 */
	public void registerListener(int id, ListenerInterface listener)
	{
		
	}
	
	public void run()
	{
		
	}

}
