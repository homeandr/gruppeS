package messages;

import java.io.Serializable;

/**
 * 
 * @Author Christian Lutz
 * 
 * Beschreibung: Diese Klasse wird immer dann wenn auf einem Client die Pause Taste gedrueckt wird.
 * Darauf hin wird diese Nachricht erzeugt und alle anderen Client mit der selben Nachricht vom 
 * Server informiert.
 * 
 * Historoy:
 * 	10.06.2010	-cl	-Init Version
 *
 */
public class PauseMsg extends Message implements Serializable
{
	
	/**
	 * damit das Objekt auch richtig serealisiert werden kann.
	 */
	private static final long serialVersionUID = 9034213112106956293L;

	
	
	/**
	 * KONSTRUKTOR
	 * 
	 * @param clientID eindeutiger Integerwert.
	 */
	public PauseMsg( final int clientID )
	{
		super(clientID);
	}
}
