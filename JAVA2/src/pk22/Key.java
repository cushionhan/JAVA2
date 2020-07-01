package pk22;

public class Key {

	public int number;
	
	public Key(int number) {
		this.number=number;		
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	//������ ������ ��ü�� hashcode���� Object�� hashcode���� ������ ������
	@Override
	public boolean equals(Object obj) {
		//�θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if(obj instanceof Key) {
			Key compareKey=(Key)obj;	//�ٿ�ĳ�������� obj�� KeyŬ������ compareKey�� ����
			if(/*this.*/number==compareKey.number)	//this�� number�� compareKey�� number���� ������ true �ƴϸ� false
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}
