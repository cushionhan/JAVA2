package pk29.staticex;

public class Student {
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}
	
	
	public static void setSerialNum() {
		Student.serialNum=serialNum;
	}
}
