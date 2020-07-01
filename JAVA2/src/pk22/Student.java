package pk22;

public class Student {

	int studentId;
	String studentName;
	
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return studentId+","+studentName;
	}

	//��
	@Override
	public int hashCode() { 
		return studentId;
	}

	//����
	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Student){  //instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�	
			Student std=(Student)obj;  //�ٿ�ĳ����: �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			
			if(studentId==std.studentId)
				return true;
			else
				return false;
		}
		return false;
		
	}

		
}
