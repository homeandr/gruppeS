package messages;

import java.io.Serializable;

public final class PlayMsg extends Message implements Serializable
{	
	// TODO auskommentiert fuer tests
	// private final playlistID;
	// private final songID;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4817333674564514902L;

	public PlayMsg( final int clientId )
	{
		super(clientId);
	}
	
}
