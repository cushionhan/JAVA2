package pk06;

public class Car {
//필드: 클래스에서 쓰는 변수 (멤버변수)
	String company = "현대자동차"; //초기화 하는 이유 다양성,중복성을 막기위해 
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		//여기서도 가능
		//company="기아자동차";
		this.model=model;
	}
	
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	//메소드
	
	
}
