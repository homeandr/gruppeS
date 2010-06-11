package messages;

import java.io.Serializable;

import container.AudioContainer;

/**
 * 
 * @Author Christian Lutz
 * 
 * Beschreibung: Diese Klasse dient als Container fuer den Audiostreams
 * 
 * History:
 * 	21.05.2010	-cl	- Init Version
 * 	22.05.2010	-cl - added AudioContainer
 *
 */
public final class AudioFrameMsg extends Message implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8026680705154261965L;
	
	
	private final AudioContainer frame;
	
	
	
	/**
	 * 
	 * @param clientId
	 * @param frame
	 * @param frameHeader
	 */
	public AudioFrameMsg( final int clientId, final AudioContainer frame ) 
	{
		super(clientId);
		this.frame = frame;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public AudioContainer getFrame()
	{
		return frame;
	}
	
	
}
