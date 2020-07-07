package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//front rear offer(³Ö) poll(»©)
		Queue<Message> messageQueue=new LinkedList<Message>();	//queue¸¦ »ç¿ëÇÏÁö¸¸ ÇüÅÂ´Â linkedlist
		
		messageQueue.offer(new Message("sendMail","È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS","ÀÓ²©Á¤"));
		messageQueue.offer(new Message("sendKakaotalk","È«µÎ±ú"));
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command){
				case "sendMail" :
					System.out.println(message.to+"´Ô¿¡°Ô "+message.command);
					break;
				case "sendSMS" :
					System.out.println(message.to+"´Ô¿¡°Ô "+message.command);
					break;
				case "sendKakaotalk" :
					System.out.println(message.to+"´Ô¿¡°Ô "+message.command);
					break;
				default:
			}
		}//StackÀÇ °æ¿ì È«µÎ±ú¸ÕÀú(FILO) QueueÀÌ±â ¶§¹®¿¡ È«±æµ¿ ¸ÕÀú(FIFO)
		
	}

}
