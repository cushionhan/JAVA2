package pk06;

public class CarGasExample {

	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		
		myCarGas.setGas(0);
		
		boolean gasState=myCarGas.isLeftGas();
		
		if(gasState) {
			System.out.println("����մϴ�.");
			myCarGas.run();	
		}
		
		if(myCarGas.isLeftGas()) {
			System.out.println("������ ����մϴ�.");
		}
		else {
			System.out.println("������ �����Ͻʽÿ�.");
		}
	}
}
