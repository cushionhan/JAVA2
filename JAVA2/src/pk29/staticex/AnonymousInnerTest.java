package pk29.staticex;
class Outter2{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	//�޼���
	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ������
		int num=100;//������������ ���ȭ final
		int localnum = 10;
		//�͸��� Ŭ����	
		return new Runnable() {
			@Override
			public void run() {
			//num=200;
			//i=20;
			System.out.println("localNum : "+localnum+"������ �ν��Ͻ� ����");
			System.out.println("outNum : "+outNum+"�ܺ� Ŭ������ �ν��Ͻ� ����");
			System.out.println("Outter2-static: "+sNum+"�ܺ� Ŭ������ ��������");
			
		}
		
	};
	
}

	
//	Runnable runner=new Runnable() {
//		@Override
//		public void run() {
//			
//		}
//	};
}
public class AnonymousInnerTest {
	public static void main(String[] args) {
		
	
	Outter2 out=new Outter2();
	Runnable runner=out.getRunnable(10);
	runner.run();
	}
}

