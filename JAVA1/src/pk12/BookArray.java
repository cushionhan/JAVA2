package pk12;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library=new Book[5];
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}	//==>인스턴스화 되지 않아 heap메모리가 없음
		
		library[0]=new Book("bookname1","author1");
		library[1]=new Book("bookname2","author2");
		library[2]=new Book("bookname3","author3");
		library[3]=new Book("bookname4","author4");
		library[4]=new Book("bookname5","author5");
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfo();
		}
		System.out.println();
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
		
		
	}

}
