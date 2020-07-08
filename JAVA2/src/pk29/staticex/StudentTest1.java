package pk29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student studentLee=new Student();
		studentLee.setStudentName("이지원");
		System.out.println("성명: "+studentLee.getStudentName() + "학번 : "+studentLee.studentID);
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentLee.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println("성명: "+studentSon.getStudentName() + "학번 : "+studentSon.studentID);
		
	}
}
