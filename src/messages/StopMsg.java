package messages;

import java.io.Serializable;

public final class StopMsg extends Message implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3799777124969879878L;
	
	

	public StopMsg( final int clientId )
	{
		super(clientId);
	}
	
}
