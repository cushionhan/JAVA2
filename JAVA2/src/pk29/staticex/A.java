package pk29.staticex;

public class A {
	A(){
		System.out.println("A��ü�� ������");
	}
	//inner class�ν��Ͻ� ��� Ŭ����
	//static ������ ���� ����
	public class B{
		//�ʵ�
		int field1;
		//private static int field2;
		//������
		B(){
			System.out.println("B��ü�� ������");
		}
		//�޼���
		void method1 () {}
		//static �޼���
		//void static method2(){}
	}
	//inner class �߿��� ����(static:DATA������ �޸� ���) ��� Ŭ����
	static class C{
		C(){
			System.out.println("C��ü�� ������");
		}
			int field1;
			static int field2;
			//�޼���
			void method1() {}
			static void method2() {}
	}
	void method() {
		//inner class�߿��� ���� Ŭ����
	class D{
		D(){
			System.out.println("D��ü�� ������");
		}
		int field1;
		//static int field2;
		void method5() {}
		//static void method2(){}
	}
	D d=new D();
	d.field1=3;
	d.method5();
			}
	}
	
	