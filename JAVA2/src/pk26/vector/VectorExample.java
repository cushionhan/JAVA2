package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list=new Vector<Board>();
		
		list.add(new Board("subjct1","content1","writer1"));
		list.add(new Board("subjct2","content2","writer2"));
		list.add(new Board("subjct3","content3","writer3"));
		list.add(new Board("subjct4","content4","writer4"));
		list.add(new Board("subjct5","content5","writer5")); 
	
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+" "+board.content+" "+board.writer);
		}
		System.out.println("============================");
		list.remove(2);
		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+" "+board.content+" "+board.writer);
		}
	
	}

}
