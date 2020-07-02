package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// immutable
		String javaStr=new String("java");
		//====================================================================================
		//ó�� ��ü�� �ν��Ͻ�ȭ�� �޸� ��
		System.out.println("javaStr�� ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		//String���κ��� StringBuilder�� ��ü�� ����
		StringBuilder buffer=new StringBuilder(javaStr);
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� Buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android");
		buffer.append(" Programming is fun!");
		
		System.out.println("���� �� Buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		//=====================================================================================
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr�� ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		
	}

}