package pk06;

public class Car {
//�ʵ�: Ŭ�������� ���� ���� (�������)
	String company = "�����ڵ���"; //�ʱ�ȭ �ϴ� ���� �پ缺,�ߺ����� �������� 
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
		
	}
	
	Car(String model){
		//���⼭�� ����
		//company="����ڵ���";
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
	//�޼ҵ�
	
	
}
