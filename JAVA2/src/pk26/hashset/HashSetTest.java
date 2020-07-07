package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		//id만들때는 hashset으로 쓸수밖에없음
		//계좌번호
		hashset.add(new String("임정순"));
		hashset.add(new String("박현"));
		hashset.add("홍연희");
//		hashset.add(new String("강감찬"));
//		hashset.add(new String("강감찬"));
		
		boolean b1=hashset.add("강감찬");
		System.out.println(b1);
		
		boolean b2=hashset.add("강감찬");
		System.out.println(b2);
		
		System.out.println(hashset);
		
	}

}
