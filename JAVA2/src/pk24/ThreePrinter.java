package pk24;
//java 1.5ÀÌÀü
public class ThreePrinter {

	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	
}
