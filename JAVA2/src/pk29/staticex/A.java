package pk29.staticex;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	//inner class인스턴스 멤버 클래스
	//static 선언할 수가 없다
	public class B{
		//필드
		int field1;
		//private static int field2;
		//생성자
		B(){
			System.out.println("B객체가 생성됨");
		}
		//메서드
		void method1 () {}
		//static 메서드
		//void static method2(){}
	}
	//inner class 중에서 정적(static:DATA영역의 메모리 사용) 멤버 클래스
	static class C{
		C(){
			System.out.println("C객체가 생성됨");
		}
			int field1;
			static int field2;
			//메서드
			void method1() {}
			static void method2() {}
	}
	void method() {
		//inner class중에서 로컬 클래스
	class D{
		D(){
			System.out.println("D객체가 생성됨");
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
	
	
