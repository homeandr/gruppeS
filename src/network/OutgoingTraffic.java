/**
 * 
 */
package network;

import eventmanager.SendMessageListener;
import messages.*;
import java.lang.Thread;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 * @author clemens
 * 
 * History
 * 		11.6.2010 -cm	-Init Version
 *
 */
public class OutgoingTraffic extends Thread implements SendMessageListener {
	
	private Socket socket;
	private ObjectOutputStream out;
	
	/**
	 * @param s
	 */
	public OutgoingTraffic(Socket s)
	{
		this.socket = s;
	}
	
	/**
	 * 
	 */
	public void run()
	{
		
	}
	
	/**
	 * @param message
	 */
	public void sendMessage(Message message)
	{
		
	}

}
