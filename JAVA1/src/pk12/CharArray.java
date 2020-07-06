package pk12;

import javax.swing.JOptionPane;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		int i;
		
		for(i=0; i<str.length;i++) {
			System.out.println(str[i]);		
		}
		
		for(i=0; i<str.length;i++) 
			res=res+str[i]+"\n";
			System.out.println(res);
			
			JOptionPane.showInternalMessageDialog(null, "배열의 문자원소"+"\n"+res);
	}

}
