package pk12;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("bookname1","author1");
		bookArray1[1]=new Book("bookname2","author2");
		bookArray1[2]=new Book("bookname3","author3");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		System.out.println("-->bookArray2로 깊은 복사");
		for(int i=0;i<bookArray2.length;i++) {
		bookArray2[i].setBookname(bookArray1[i].getBookname());
		bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		bookArray2[i].showBookinfo();
		}
		System.out.println();
		
		System.out.println("bookArray1 수정");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].setBookname("newbookname"+i);
			bookArray1[i].setAuthor("newauthor"+i);
		}
		System.out.println();
		
		System.out.println("-->수정 후 bookArray1");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println();
		
		System.out.println("-->수정 후 bookArray2");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].showBookinfo();	
		}
		

	}

}
