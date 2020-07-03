package pk06;

public class CalculatorExample {

	public static void main(String[] args) {
		
	Calculator MyCalc=new Calculator();
		
	MyCalc.powerOn();
	int result1=MyCalc.plus(5, 5);
	System.out.println("x+y="+result1);
	
	byte x=10;
	byte y=2;
	double result2=MyCalc.divide(x, y);
	System.out.println("x/y="+result2);
		
	MyCalc.powerOff();

	}

}
