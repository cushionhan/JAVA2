package pk30.lambda;

@FunctionalInterface
public interface Add {

	public int add(int x, int y);
//	public int add2(int x1, int y1);
	
}
//@FunctionalInterface : 하나의 인터페이스는 반드시 하나의 함수로만 구성한다(안전장치)