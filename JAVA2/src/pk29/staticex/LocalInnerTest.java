package pk29.staticex;

class Outter{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	//�޼���
	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ������
		int num=100;//������������ ���ȭ final
		
		//�޼��� ���ο� Ŭ���� ����
		class MyRunnable implements Runnable{
			int localnum = 10;
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : "+localnum+"������ �ν��Ͻ� ����");
				System.out.println("outNum : "+outNum+"�ܺ� Ŭ������ �ν��Ͻ� ����");
				System.out.println("Outter-static: "+sNum+"�ܺ� Ŭ������ ��������");
			}
			
		}
		return new MyRunnable();
	}
	
}
public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outter out=new Outter();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}

}
