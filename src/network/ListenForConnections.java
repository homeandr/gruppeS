package network;

import messages.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.Thread;

/**
 * @author clemens
 * 
 * History
 * 		11.6.2010 -cm	-Init Version
 *
 */
public class ListenForConnections extends Thread {
	
	private ServerSocket socket;
	
	/**
	 * @param s
	 */
	public ListenForConnections(ServerSocket s)
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
