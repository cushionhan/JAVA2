package pk06;

public class PersonExample {

	public static void main(String[] args) {
	
		Person person1=new Person("123456-1234567","ȫ�浿");
		System.out.println(person1.nation);
		System.out.println(person1.pid);
		//final : fix�Ǿ� �����Ƿ� ����Ұ�
		//person1.nation="ȫ���";
		//person1.pid="123123-1231234";
		System.out.println(person1.name);
	}

}
