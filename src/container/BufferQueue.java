package container;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
 *
 * @Author Christian Lutz
 *	
 * Beschreibung:
 *  Der FrameBuffer dient als Zwischenablage für bereits dekodierten Frames.
 *	
 * History:
 *  27.06.2009  - InitVersion
 *  04.05.2010  - Changed this class to FrameBuffer so we can use it for our NASP
 *  16.05.2010	-cl	- Changed name to BufferQueue and moved it to a generic class
 *
 *
 * 
 *
 *
 */
public class BufferQueue<T>
{

    private final Lock lock = new ReentrantLock();
    private final Condition full = lock.newCondition();
    private final Condition empty = lock.newCondition();
    private long calledFrames = 0;

    private final int queueSize;
    private LinkedList<T> frameQueue = new LinkedList<T>();

    
    
    /**
     * Konstruktor
     * 
     * @param queueLength bestimmt wie lange die queue sein soll.
     */
    public BufferQueue(final int queueLength )
    {
    	queueSize = queueLength;
    }
    
  
    
    /**
     * fuegt das neue Objekt immer an der Queue an
     *
     * @param value vom typ T, wird an die Schlange angehängt
     * @throws InterruptedException
     */
    public void add( final T value ) throws InterruptedException 
    {

        lock.lock();
        try
        {
        	while( frameQueue.size() == queueSize ) full.await();
        	// eigentlich muss von value eine Kopie erstellt werden.
        	frameQueue.add(value);
        	empty.signalAll();
        }
        finally
        {
        	lock.unlock();
        }
        
    }


    
    /**
     *
     * @return gibt den naechsten aus der Warteschlange zurueck
     * @throws InterruptedException
     *
     */
    public T poll() throws InterruptedException 
    {

        lock.lock();
        try
        {
        	while( frameQueue.size() == 0 ) empty.await();
        	T tmp = frameQueue.poll();
        	full.signalAll();
        	calledFrames++;
        	return tmp;
        }
        finally
        {
        	lock.unlock();
        }
        
    }

    
    
    /**
     * 
     * löscht alle Elemente aus dem Buffer
     * 
     */
    public void clearBuffer()
    {
    	lock.lock();
    	try
    	{
    		frameQueue.clear();
    		full.signalAll();
    	}
    	finally
    	{
    		lock.unlock();
    	}
    }
    

    
    /**
     *
     * @return gibt immer die aktuelle Groesse des Puffers zuerueck
     * 
     */
    public int getSize() 
    {
        return frameQueue.size();
    }


    
    /**
     *
     * @return gibt die Anzahl der bereits gelesenen Objekte zurück
     */
    public long getFlowNumber() 
    {
        return calledFrames;
    }

}
