package container;

import java.io.Serializable;


/**
 * 
 * @Author Christian Lutz
 * 
 * Beschreibung: Dieser Container beinhaltet alle Information ueber den Audiostream und den Audiostream selbst.
 * 
 * History:
 * 	22.05.2010	-cl	- Init Version
 *
 */
public final class AudioContainer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6927523171864781259L;
	
	
	private final float sampleRate;
	private final int sampleSizeInBits;
	private final int channels;
	private final boolean signed;
	private final boolean bigEnding;
	private final byte[] data;
	
	
	
	/**
	 * 
	 * @param data
	 * @param sampleRate
	 * @param sampleSizeInBits
	 * @param channels
	 * @param signed
	 * @param bigEnding
	 */
	public AudioContainer( final byte[] data, final float sampleRate, final int sampleSizeInBits, final int channels,
							final boolean signed, final boolean bigEnding )
	{
		this.sampleRate = sampleRate;
		this.sampleSizeInBits = sampleSizeInBits;
		this.channels = channels;
		this.signed = signed;
		this.bigEnding = bigEnding;
		
		this.data = new byte[data.length];
		
		try
		{			
			// kopiert data in interne Struktur, wegen java 1.5 noch System.arraycopy
			System.arraycopy( data, 0, this.data, 0, data.length );
		}
		catch( NullPointerException e )
		{
			e.printStackTrace();
		}
		catch( IndexOutOfBoundsException e )
		{
			e.printStackTrace();
		}
		catch( ArrayStoreException e )
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public float getSampleRate()
	{
		return sampleRate;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public int getSampleSize()
	{
		return sampleSizeInBits;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public int getChannels()
	{
		return channels;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public boolean getSigned()
	{
		return signed;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public boolean getBigEnding()
	{
		return bigEnding;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public byte[] getData()
	{
		byte[] tmp = new byte[data.length];
		System.arraycopy( data, 0, tmp, 0, data.length );
		return tmp;
	}
	
}
