package pk22;


class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return title+","+author;
	}	
}

public class ToStringEx {

	public static void main(String[] args) {

		Book book=new Book("JAVA","홍길동");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		//toString안에 String이 재정의 되어있음
		
		
		
	}

}
