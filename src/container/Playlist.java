package container;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @Author Christian Lutz
 * 
 * Beschreibung: Diese Klasse dient als Kontainer fuer die alle Songs einer Playliste.
 * 
 * History:
 * 	21.05.2010	-cl	- Init Version
 * 
 * TODO:
 * 	- ThreadSave
 * 	- Comparable fuer Sortierung
 *
 */
public final class Playlist
{
	private final int plID;
	
	// Name der Playliste
	private String plName;
	
	// Die gesamte Spieldauer der Playliste in Sekunden
	private int duration;
	
	// Lieder in der Playliste
	private ArrayList<Song> songs;
	
	
	
	/**
	 * Konstruktor
	 * 
	 * @param id (int) ist eine eindeutige Nummer fuer diese Playliste
	 * @param name (String) der Playliste
	 */
	public Playlist( final int id, final String name )
	{
		this.plID = id;
		this.plName = name;
		songs = new ArrayList<Song>();
	}
	
	
	
	/**
	 * Fuegt einen neuen Song zur Playliste hinzu. Dabei wir die Laenge des Liedes
	 * zur gesamt Spieldauer hinzugefuegt.
	 * 
	 * @param song wird zur Playliste hinzugefuegt
	 */
	public void addSong( final Song song ) 
	{
		songs.add(song);

		duration += song.getLaenge();	
	}
	
	
	
	/**
	 * 
	 * @return gibt die id der Playliste zurueck
	 */
	public int getPlaylistID()
	{
		return plID;
	}
	
	
	
	/**
	 * 
	 * @return gibt den Namen der Playliste zurueck
	 */
	public String getPlaylistName()
	{
		return plName;
	}
	
	
	
	/**
	 * 
	 * @return gibt die akutelle Anzahl an Songs in der Playliste zurueck
	 */
	public int getSize()
	{
		return songs.size();
	}
	
	
	
	/**
	 * 
	 * @return gibt einen Iterator<Songs> ueber alle Lieder zurueck
	 */
	public Iterator<Song> iterator()
	{
		return songs.iterator();
	}
	
	
	
	/**
	 * 
	 * @param name fuer die aktuelle Playliste
	 */
	public void setPlaylistName( final String name )
	{
		plName = name;
	}
	
	
	
	/**
	 * Angegebner Song wird aus der Liste entfernt und
	 * die Spieldauer wird um die entsprechende Laenge reduziert.
	 * 
	 * @param song wird aus der Liste geloescht
	 */
	public void removeSong( final Song song )
	{
		songs.remove(song);

		duration -= song.getLaenge();
	}
	
	
	
	/**
	 * Loescht ein Lied mit entsprechender ID aus der Playliste und
	 * die Spieldauer wird um die entsprechende Laenge reduziert.
	 * 
	 * @param songID 
	 */
	public void removeSong( final int songID )
	{
		
		Iterator<Song> iter = songs.iterator();
		Song song = null;
		int songIndex = 0;
		
		// durchsucht die komplette Playliste nach diesem Lied
		while( iter.hasNext() )
		{
			song = iter.next();
			if( song.getID() == songID ) 
			{
				// loscht das Lied aus der Playliste
				songs.remove(songIndex);
				
				duration -= song.getLaenge();

			}
			songIndex++;
		}
		
	}
}
