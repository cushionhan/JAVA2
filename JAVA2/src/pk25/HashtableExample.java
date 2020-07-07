package pk25;

import java.util.*;


public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();

		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디 : ");
			String id=scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String password=scanner.nextLine();
			System.out.println();
			//containsKey: HashMap에서 제공하는 Key값을 확인하는 메소드
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인성공");
					break;
				}
				else 
					System.out.println("비밀번호 안맞아");
				
			}
			else {
				System.out.println("없는 아이디");
			}
		}
	}

}
