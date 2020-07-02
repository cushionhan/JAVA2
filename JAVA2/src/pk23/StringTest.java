package pk23;

public class StringTest {

	public static void main(String[] args) {
		String javastr=new String("JAVA ");
		String androidstr=new String("and android");
//		String javastr2="JAVA";
		
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(javastr));
//		System.out.println(javastr.hashCode());
//		System.out.println(System.identityHashCode(javastr2));
//		System.out.println(javastr2.hashCode());
		
		
		javastr=javastr.concat(androidstr);
//		System.out.println();
		
		System.out.println(javastr);
		
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javastr));
//		System.out.println(javastr.hashCode());
//		System.out.println(System.identityHashCode(javastr.concat(androidstr)));
//		System.out.println(javastr.concat(androidstr).hashCode());
	}

}
