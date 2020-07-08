package chapter26;

public class Student2 {
	//필드(private)
	private String name;
	private String major;
	private String studentId;
	private Double average;
	//생성자
	public Student2(String name, String major, String studentId, Double average) {
		this.name=name;
		this.major=major;
		this.studentId=studentId;
		this.average=average;
	}
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public Double getAverage() {
		return average;
	}
	


	public void find_student(String name) {
		if(name.equals(this.name)) {
			System.out.println(average);
		}
	}
	
	
}
