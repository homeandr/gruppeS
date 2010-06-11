/**
 * 
 */
package network;

import messages.*;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.lang.Thread;

/**
 * @author clemens
 *
 * History
 * 		11.6.2010 -cm	-Init Version
 */
public class IncomingTraffic extends Thread {
	
	private ObjectInputStream in;
	private Socket socket;
	
	/**
	 * @param s
	 */
	public IncomingTraffic(Socket s)
	{
		this.socket = s;
	}
	
	/**
	 * 
	 */
	public void run()
	{
		
	}

}
