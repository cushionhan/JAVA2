package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//front rear offer(��) poll(��)
		Queue<Message> messageQueue=new LinkedList<Message>();	//queue�� ��������� ���´� linkedlist
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�Ӳ���"));
		messageQueue.offer(new Message("sendKakaotalk","ȫ�α�"));
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command){
				case "sendMail" :
					System.out.println(message.to+"�Կ��� "+message.command);
					break;
				case "sendSMS" :
					System.out.println(message.to+"�Կ��� "+message.command);
					break;
				case "sendKakaotalk" :
					System.out.println(message.to+"�Կ��� "+message.command);
					break;
				default:
			}
		}//Stack�� ��� ȫ�α�����(FILO) Queue�̱� ������ ȫ�浿 ����(FIFO)
		
	}

}
