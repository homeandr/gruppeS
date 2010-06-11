package eventmanager;

import messages.Message;

/**
 * @author clemens
 *
 * Histroy
 * 		11.6.2010	-cm		-Initial Version
 */
public interface SendMessageListener extends ListenerInterface{
	
	public void sendMessage(Message message);
}
