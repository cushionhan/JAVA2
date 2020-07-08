package chapter26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StudentArrayList2 {

	public static void main(String[] args) {
		Student []student=new Student[4];
		HashMap<String,Student> hashMap=new HashMap<String,Student>();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���");
		for(int i=0;i<student.length;i++) {
			/*student[i]=new Student(sc.next(),sc.next(),sc.next(),sc.nextDouble());
			arrayList.add(student[i]);
			
			if(arrayList.size()<4) {
				System.out.println("������� �Է��ϼ���");*/
			System.out.print(">>");
			//�Է�
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String department=st.nextToken().trim();
			String number=st.nextToken().trim();
			Double grade=Double.parseDouble(st.nextToken().trim());
			student[i] = new Student(name, department, number, grade);
			hashMap.put(name, student[i]);
			
			}
		Set<String> key=hashMap.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println("--------------------------------");
			Student s=hashMap.get(name);
			System.out.println("�̸�: "+s.getName());
			System.out.println("�а�: "+s.getMajor());
			System.out.println("�й�: "+s.getStudentId());
			System.out.println("�������: "+s.getAverage());
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.println("�л��̸� >>");
			String name = sc.next();
			if(name.equals("�׸�"))
				break;
			Student s=hashMap.get(name);
			s.find_student(name);
		}
		sc.close();
	}

}
