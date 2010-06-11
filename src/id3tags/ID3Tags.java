package id3tags;


import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.AbstractTagFrame;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyTextInfo;
import java.io.File;
import java.io.IOException;
import logic.Song;


public class ID3Tags
{
	private int index = 0;

	public Song getID3Infos( String filename ) throws CannotReadException, IOException
	{
		String path = "";
		boolean  available = true;
		String titel = "";
		String album = "";
		String artist = "";
		String year = ""; 
		String genre = ""; 
		int lenght = 0;


		try
		{


			File file = new File( filename );
			MP3File  mp3file   =  (MP3File) AudioFileIO.read(file);
			Tag tag = mp3file.getTag();
			if( mp3file.hasID3v2Tag() ||  mp3file.hasID3v1Tag() ) 

			{

				titel = tag.getFirst(FieldKey.TITLE);
				album = tag.getFirst(FieldKey.ALBUM);
				artist = tag.getFirst(FieldKey.ARTIST);
				year = tag.getFirst(FieldKey.YEAR); 
				genre = tag.getFirst(FieldKey.GENRE); 
				lenght = (int) mp3file.getMP3AudioHeader().getTrackLength();
				


			}

			else 

			{
				titel = file.getName();
				artist = file.getName();
			}

			//    	   And that works well enough.  For writing the tags I'm trying this:

		}
		catch (TagException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ReadOnlyFileException e)	
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAudioFrameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return new Song(index, titel, album, artist, year, genre, lenght, path, available );


	}

}