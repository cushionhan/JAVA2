package pk12;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		
		bookArray1[0]=new Book("bookname1","author1");
		bookArray1[1]=new Book("bookname2","author2");
		bookArray1[2]=new Book("bookname3","author3");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		System.out.println();
		
		bookArray1[0].setBookname("newbookname1");
		bookArray1[0].setAuthor("newauthor1");
		
		System.out.println("bookArray1");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println();
		
		System.out.println("bookArray2");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		//¾èÀº º¹»ç : ¿øº»ÀÌ ¹Ù²î¸é º¹»çº»µµ ¹Ù²ñ
		
	}

}
