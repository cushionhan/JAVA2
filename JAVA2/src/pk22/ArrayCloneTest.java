package pk22;

public class ArrayCloneTest {

	public static void main(String[] args) {
		int []arr1= {1,2,3,4,5};
		int []arr2;
		
		arr2=arr1.clone();
		
		System.out.print("복사된 arr2배열: ");
		//일반for문 : for(int i=0;i<5;i++) --> Enhanced for Loop
		for(int num:arr2) {
			System.out.print(num + ",");
		}
		System.out.println();
		
		arr2[3]=0; //arr2의 요소값을 변경
		System.out.print("변경 후 arr1배열: ");
		for(int num:arr1) {
			System.out.print(num + ",");
		}
		System.out.println();
		
		System.out.print("변경 후 arr2배열: ");
		for(int num:arr2) {
			System.out.print(num + ",");
		}
		System.out.println();
		
		
	}

}
