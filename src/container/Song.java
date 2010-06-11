package container;

import java.io.Serializable;

/**
 * 
 * @Author: Christian Lutz
 * 
 * Beschreibung: Diese Klasse dient als Kontainer für einzelne Songs und deren Attribute
 * 				 Beachtet dass es sich um ein Immutable handelt, und auch so bleiben soll!
 * 				 Nur so koennen wir sicher gehen, dass sie Thread-Save sind.
 * 
 * History:
 * 	13.05.2010	-cl	- Init Version
 * 	21.05.2010	-cl	- added available Attribute, more Constructors, documented
 * 
 * 
 */
public final class Song implements Serializable 
{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3171130968728295885L;
	
	
	// internal information
	private final int id;
	private final String path;
	private final boolean available;
	
	// Lied Eigenschaften
	private final String titel;
	private final String album;
	private final String interpret;
	private final String jahr;
	private final String genre;
	private final int laenge;
	
	
	
	/**
	 * Konstruktor
	 * 
	 * @param id eindeutige Identifizierung eines Songs
	 * @param titel des Songs
	 * @param album aus dem der Song stammt
	 * @param interpret des Songs
	 * @param jahr in dem der Song veroeffentlich wurde
	 * @param genre dem der Song zugeordnet wird
	 * @param laenge des Songs
	 * @param path in dem der Song liegt
	 */
	public Song( final int id, final String titel, final String album, final String interpret,
				 final String jahr, final String genre, final int laenge, final String path, 
				 final boolean available )
	{
		this.id = id;
		this.titel = titel;
		this.album = album;
		this.interpret = interpret;
		this.jahr = jahr;
		this.genre = genre;
		this.laenge = laenge;
		this.path = path;
		this.available = available;
		
	}
	
	
	
	/**
	 * Kopierkonstruktor
	 * 
	 * @param song eine identische Kopie des uebergebenen Songs wird angelegt.
	 */
	public Song( final Song song )
	{
		this.id = song.getID();
		this.titel = song.getTitle();
		this.album = song.getAlbum();
		this.interpret = song.getInterpret();
		this.jahr = song.getJahr();
		this.genre = song.getGenre();
		this.laenge = song.getLaenge();
		this.path = song.getPath();
		this.available = song.isAvailable();
	}
	
	
	
	/**
	 * 
	 * @return gibt die eindeutige ID fuer dieses Lied zueruck
	 */
	public int getID()
	{
		return id;
	}
	
	
	
	/**
	 * 
	 * @return gibt den Titel des Liedes zurueck
	 */
	public String getTitle() 
	{
		return titel;
	}
	
	
	
	/**
	 * 
	 * @return gibt das Album aus dem das Lied stammt zurueck
	 */
	public String getAlbum()
	{
		return album;
	}
	
	
	
	/**
	 * 
	 * @return gibt den Interpreten des Liedes zurueck
	 */
	public String getInterpret()
	{
		return interpret;
	}
	
	
	
	/**
	 * 
	 * @return gibt das Jahr in dem das Lied veroeffentlich wurde zueruck
	 */
	public String getJahr()
	{
		return jahr;
	}
	
	
	
	/**
	 * 
	 * @return gibt das Genre zu dem das Lied gehoert zurueck
	 */
	public String getGenre()
	{
		return genre;
	}
	
	
	
	/**
	 * 
	 * @return gibt die Laufzeit des Liedes in Sekunden zurueck
	 */
	public int getLaenge()
	{
		return laenge;
	}
	
	
	
	/**
	 * 
	 * @return gibt den Pfad des Liedes zurueck
	 */
	public String getPath()
	{
		return path;
	}
	
	
	
	/**
	 * 
	 * @return gibt true zurueck wenn es bisher keinen Fehler mit dem Lied gab, sonst false 
	 */
	public boolean isAvailable()
	{
		return available;
	}
	
}
