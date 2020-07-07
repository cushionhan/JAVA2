package chapter26;

public class Student {
	//필드(private)
	private String name;
	private String major;
	private String studentId;
	private Double average;
	//생성자
	public Student(String name, String major, String studentId, Double average) {
		this.name=name;
		this.major=major;
		this.studentId=studentId;
		this.average=average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	@Override
	public String toString() {
		
		return name+", "+major+", "+studentId+", "+average;
	}
	public void find_student(String name) {
		if(name.equals(this.name)) {
			System.out.println(average);
		}
	}
	
	
}
