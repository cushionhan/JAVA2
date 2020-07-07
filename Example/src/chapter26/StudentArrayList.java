package chapter26;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

	public static void main(String[] args) {
		Student []student=new Student[4];
		ArrayList<Student> arrayList=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<student.length;i++) {
			student[i]=new Student(sc.next(),sc.next(),sc.next(),sc.nextDouble());
			arrayList.add(student[i]);
			continue;
			System.out.println("다음사람 입력하세요");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
