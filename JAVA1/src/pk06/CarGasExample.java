package pk06;

public class CarGasExample {

	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		
		myCarGas.setGas(0);
		
		boolean gasState=myCarGas.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCarGas.run();	
		}
		
		if(myCarGas.isLeftGas()) {
			System.out.println("가스가 충분합니다.");
		}
		else {
			System.out.println("가스를 충전하십시오.");
		}
	}
}
