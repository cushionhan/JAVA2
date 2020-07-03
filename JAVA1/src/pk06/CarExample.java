package pk06;

public class CarExample {

public static void main(String[] args) {
	System.out.println("--------------필드활용1---------------");
	Car car1=new Car();
	System.out.println("car1.company : "+car1.company);
	System.out.println();
	
	System.out.println("--------------필드활용2---------------");
	Car car2=new Car("소나타");
	//초기화 된 필드지만 변경이 가능하다
	//car2.company="기아자동차";
	System.out.println("car2.company : "+car2.company);
	System.out.println("car2.model : "+car2.model);
	System.out.println();
	
	System.out.println("--------------필드활용3---------------");
	Car car3=new Car("소나타", "빨강");
	System.out.println("car3.company : "+car3.company);
	System.out.println("car3.model : "+car3.model);
	System.out.println("car3.color : "+car3.color);
	System.out.println();
	
	System.out.println("--------------필드활용3---------------");
	Car car4=new Car("택시","검정",200);
	System.out.println("car4.company : "+car4.company);
	System.out.println("car4.model : "+car4.model);
	System.out.println("car4.color : "+car4.color);
	System.out.println("car4.maxSpeed : "+car4.maxSpeed);
	
	//인스턴스변수.클래스변수=인스턴스초기화값	
	}

}