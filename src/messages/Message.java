package messages;

import java.io.Serializable;

/**
 * @author clemens
 * 
 * Die Oberklasse für alle Messages.
 *
 * History
 * 		11.6.2010	-cm		- Initial Version
 * 					-cl		- Serializable hinzugefuegt
 * 
 */
public abstract class Message implements Serializable 
{
	
	/**
	 * Object id
	 */
	private static final long serialVersionUID = 8636568760081115843L;
	
	//id der Message
	private int id;
	
	
	
	
	/**
	 * KONSTRUKUTOR
	 * 
	 * @param id
	 */
	public Message( final int id )
	{
		this.id = id;
	}
	
	
	
	/**
	 * @return id
	 */
	public int getID()
	{
		return id;
	}
}
