package pk29.staticex;

class OutClass{
	//�ʵ�(�ν��Ͻ� ����=�������=�Ӽ�)
	private static int num=10;
	private static int sNum=20;
	private InClass inClass;	//���� Ŭ������ ����ó�� Ȱ���ϱ� ���� ����
	
	//������construct�� ���ؼ� ���� Ŭ���� ��ü ����
	
	public OutClass(){
		System.out.println("OutClass�� ��ü�� �����Ǿ����ϴ�.");
		inClass=new InClass();//���� Ŭ���� ����
	}
	class InClass{
		//���� Ŭ������ �ʵ�
		int inNum=100;
		//�ܺο� �ν��Ͻ� ������ ����Ǿ� �ִ� static�� ������� ����ϴ� ���� ����������
		//������ �ǰ� ������� ����ؾ� �ϴ� staticŸ���� ������ �ٸ������� �������� �� ��
//		static int sNum=300;
//		static int sInNum=200;
//		static void sTest() {}
		//�޼���
		void inTest() {
			System.out.println("OutClass num="+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum="+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass inNum="+inNum+"(���� Ŭ������ �ν��Ͻ� ����)");
		}
		
	}
	static class InStaticClass{
		//�ʵ�
		int inNum=100;
		static int sInNum=200;
		void inTest() {
			//num += 10; //�ܺ��� �ν��Ͻ�
			System.out.println("InStaticClass inNum = "+inNum+"(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sNum="+sNum+"(���� Ŭ������ static ���� ���)");
			System.out.println("InStaticClass inNum="+inNum+"(�ܺ� Ŭ������ static ���� ���)");
		}
			static void sTest() {
				//num+=10;
				//inNum+=10;
				sNum=30;
				System.out.println(sNum);
				System.out.println(sInNum);
				
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		//�ܺ� Ŭ���� ��ü ����
		OutClass outClass=new OutClass();
		System.out.println();
		
		//�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		OutClass.InClass inClass=outClass.new InClass();
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		System.out.println();
			
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ static �޼��� ȣ��");
		
		//��ü���� ȣ��
		sInClass.sTest();
		//Ŭ�������� ȣ��
		System.out.println("���� ���� Ŭ������ static�޼��� ȣ��2");
		OutClass.InStaticClass.sTest();
		

	}

}
