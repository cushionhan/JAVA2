package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentArrayList {

	public static void main(String[] args) {
		Student []student=new Student[4];
		ArrayList<Student> arrayList=new ArrayList<Student>();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<student.length;i++) {
			/*student[i]=new Student(sc.next(),sc.next(),sc.next(),sc.nextDouble());
			arrayList.add(student[i]);
			
			if(arrayList.size()<4) {
				System.out.println("다음사람 입력하세요");*/
			System.out.print(">>");
			//입력
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String department=st.nextToken().trim();
			String number=st.nextToken().trim();
			Double grade=Double.parseDouble(st.nextToken().trim());
			student[i] = new Student(name, department, number, grade);
			arrayList.add(student[i]);
			
			}
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("--------------------------------");
			Student s=arrayList.get(i);
			System.out.println("이름: "+s.getName());
			System.out.println("학과: "+s.getMajor());
			System.out.println("학번: "+s.getStudentId());
			System.out.println("학점평균: "+s.getAverage());
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.println("학생이름 >>");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			for(int i=0;i<arrayList.size();i++) {
				Student s=arrayList.get(i);
				s.find_student(name);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
