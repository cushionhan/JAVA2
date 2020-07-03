package chapter22;

public class Member {
	public String id;
	
	Member(String id){
		this.id=id;
	}

	@Override
	public int hashCode() {
		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem=(Member)obj;
			if(id.equals(mem.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}

