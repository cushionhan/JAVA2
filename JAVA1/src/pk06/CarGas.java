package pk06;

public class CarGas {
	//필드
	int gas;
	//생성자
	//메소드
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		//gas0 이면 gas가 없습니다. -> false
		if(gas==0) { 
			System.out.println("가스가 없습니다.");
			return false;
		}
		else {
			System.out.println("가스가 있습니다.");
			return true;
		}
		
	}
	
	void run() {
		//gas가 0보다 크면 달립니다..  gas보유량
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (가스잔여량 :"+gas+")");
				gas-=1;
		}
			else {
				System.out.println("멈춥니다. (가스잔여량: "+gas+")");
				return;
			}
		}
	}
}

