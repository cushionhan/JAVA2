package pk06;

public class PersonExample {

	public static void main(String[] args) {
	
		Person person1=new Person("123456-1234567","È«±æµ¿");
		System.out.println(person1.nation);
		System.out.println(person1.pid);
		//final : fixµÇ¾î ÀÖÀ¸¹Ç·Î º¯°æºÒ°¡
		//person1.nation="È«»ï±Ê";
		//person1.pid="123123-1231234";
		System.out.println(person1.name);
	}

}
