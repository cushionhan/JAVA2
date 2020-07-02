package pk24;

class MyArr<T>{
	private Object[] arr=new Object[10];
	int i;
	
	public void add(T obj) {
		arr[i++]=obj;
	}
	
	public T get(int index) {
		return (T) arr[index];
	}
}

public class MyArrayTest1 {

	public static void main(String[] args) {
		
		MyArr<String> myarray1=new MyArr<String>();
		myarray1.add(new String("test"));
		String str=myarray1.get(0);
		System.out.println(str);
		
		MyArr<Integer> myarray2=new MyArr<Integer>();
		myarray2.add(new Integer(123));
		Integer ing=myarray2.get(0);
		System.out.println(ing);
	}

}
