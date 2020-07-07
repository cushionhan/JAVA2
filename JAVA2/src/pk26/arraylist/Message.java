package pk26.arraylist;

public class Message {
	public String command;	//메세지 내용
	public String to;		//수신자
	
	public Message(String command, String to) {
		this.command=command;
		this.to=to;
	}
	
}
