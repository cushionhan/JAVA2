package pk30.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="World";
		
		//객체지향 방식
		StringConcatImpl concat1=new StringConcatImpl();
		concat1.makeString("객체지향 방식: "+s1, s2);
		
		//람다식(구현부생략)
		StringConcat concat2=(s,v)->System.out.println(s+" "+v);
		concat2.makeString("람다식: "+s1, s2);
		
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1+" "+s2);
			}
		};
		concat3.makeString("익명의 클래스: "+s1, s2);
		
		
		
	}

}
