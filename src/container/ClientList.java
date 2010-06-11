package container;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @Author Christian Lutz
 * 
 * Beschreibung: Diese Klasse beinhaltet alle Information ueber die Gruppen, welche Clients 
 * dazugehoeren welche Playliste gerade abgespielt wird.
 * 
 * History:
 * 	10.06.2010	-cl	-Init Version
 *
 */
public final class ClientList implements Serializable
{
	/**
	 * Objekt id zum serialisieren.
	 */
	private static final long serialVersionUID = -4019236049547144603L;
	
	
	// Liste mit allen Clients
	private List<Client> clients;
	
	
	
	/**
	 * KONSTRUKTOR - ohne Parameter
	 */
	public ClientList()
	{
		clients = new ArrayList<Client>();
	}
	
	
	
	/**
	 * Fuegt einen neuen Client hinzu
	 * 
	 * @param client vom <type>Client</type> der hinzugefuegt wird.
	 */
	public void addClient( final Client client )
	{
		clients.add( client );
	}
	
	
	
	/**
	 * liefert einen Iterator ueber die ClientList, dieser Iterator ist aber nur eine Kopie,
	 * wodurch die eigentlich Liste nicht veraenderbar ist.
	 * 
	 * @return Iterator ueber die Clients
	 */
	public Iterator<Client> iterator()
	{
		return new ArrayList<Client>(clients).iterator();
	}
	
	
	
	/**
	 * 
	 * @author Christian Lutz
	 *	
	 *	Beschreibung: Subklasse fuer die ClientList
	 */
	public class Client
	{
		// Client Eigenschaften
		private int clientID;
		private int groupID;
		private String location;
		private String playlist;
		
		
		
		/**
		 * KONSTRUKTOR - bekommt alle Parameter mit die fuer die Klasse notwendig sind.
		 * 
		 * @param cID Client ID
		 * @param gID Group ID
		 * @param loc Ort des Clients
		 * @param pllist Name der aktuell gespielen Playliste
		 */
		public Client(final int cID, final int gID, final String loc, final String pllist )
		{
			clientID = cID;
			groupID = gID;
			location = loc;
			playlist = pllist;
		}
		
		
		
		/**
		 * 
		 * @return liefert die Client id
		 */
		public int getClientID()
		{
			return clientID;
		}
		
		
		
		/**
		 * 
		 * @return liefert die Group id
		 */
		public int getGroupID()
		{
			return groupID;
		}
		
		
		
		/**
		 * 
		 * @return liefert den aktuellen Ort des Clients
		 */
		public String getLocation()
		{
			return location;
		}
		
		
		
		/**
		 * 
		 * @return liefert den Namen der aktuellen Playliste.
		 */
		public String getPlaylistName()
		{
			return playlist;
		}
		
	}
	
}
