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
		//���ٽ��� ������ ����
		PrintString lambdaStr= s ->System.out.println(s);
		
		
		lambdaStr.showString("hello Lambda_1");
		
		//�Լ��� ���� ����1
		showMyString(lambdaStr);//lambdaStr���ٽ� ��ü
		// s ->System.out.println(s); ����Ǿ� lambdaStr�� �������
		
		//�Լ��� ���� ����2
		PrintString lambdaStr2=returnString();
		lambdaStr2.showString("hello");
		
		

	}

}
