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
	//������ �ּ� ���� �����
	@Override
	public int hashCode() {
		return number;
	}

	//���� �ּ� ���Ը����
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
	
	//equals �������̵�
	
	
	//hashcode�������̵�
}
