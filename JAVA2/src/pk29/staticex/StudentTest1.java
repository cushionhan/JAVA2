package pk29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student studentLee=new Student();
		studentLee.setStudentName("������");
		System.out.println("����: "+studentLee.getStudentName() + "�й� : "+studentLee.studentID);
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentLee.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println("����: "+studentSon.getStudentName() + "�й� : "+studentSon.studentID);
		
	}
}
