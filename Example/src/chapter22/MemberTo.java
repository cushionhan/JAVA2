package chapter22;

public class MemberTo {
	private String id;
	private String name;
	
	MemberTo(String id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "id´Â "+id+", "+"nameÀº"+name;
	}
	
	
	
	

}
