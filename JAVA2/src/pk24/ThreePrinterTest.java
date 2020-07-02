package pk24;

public class ThreePrinterTest {

	public static void main(String[] args) {
		

		ThreePrinter printer=new ThreePrinter();
		
		Powder p1=new Powder();
		printer.setMaterial(p1);
		//다운 캐스팅
		Powder p2=(Powder)printer.getMaterial();
	}

}
