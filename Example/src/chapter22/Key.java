package chapter22;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	//물리적 주소 같게 만들기
	@Override
	public int hashCode() {
		return number;
	}

	//논리적 주소 같게만들기
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Key) {
		Key compareKey=(Key)obj;
		if(this.number==compareKey.number) {
			return true;
		}
	}
		return false;
	}
	
	//equals 오버라이딩
	
	
	//hashcode오버라이딩
}
