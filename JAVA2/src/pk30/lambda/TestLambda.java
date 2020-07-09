package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void showMyString(PrintString p) {
		p.showString("hello Lambda_2");
	}
	
	public static PrintString returnString() {
		return s ->System.out.println(s+" "+"Lambda_3");
	}
	
	public static void main(String[] args) {
		//람다식을 변수에 대입
		PrintString lambdaStr= s ->System.out.println(s);
		
		
		lambdaStr.showString("hello Lambda_1");
		
		//함수형 람다 유형1
		showMyString(lambdaStr);//lambdaStr람다식 객체
		// s ->System.out.println(s); 복사되어 lambdaStr에 담겨있음
		
		//함수형 람다 유형2
		PrintString lambdaStr2=returnString();
		lambdaStr2.showString("hello");
		
		

	}

}
