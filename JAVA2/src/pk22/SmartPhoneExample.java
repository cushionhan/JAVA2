package pk22;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		
		SmartPhone myPhone=new SmartPhone("구글","안드로이드");

		//System.out.println(myPhone); => hashcode
		String strObj=myPhone.toString();
		
		System.out.println(strObj);
	}

}


//pk22.SmartPhone@7ce6a65d