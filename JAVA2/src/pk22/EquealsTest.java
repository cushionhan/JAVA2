package pk22;

public class EquealsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang= new Student(100, "�̻��");

		//������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee == studentLee2)
			System.out.println("���� �ν��Ͻ� ���� ������");
		else
			System.out.println("�ٸ� �ν��Ͻ� ���� ������");
		
		if(studentLee.equals(studentLee2))
			System.out.println("���� �ν��Ͻ� ���� ������");
		else
			System.out.println("�ٸ� �ν��Ͻ� ���� ������");
	
		//�ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		if(studentLee==studentSang)
			System.out.println("���� �ν��Ͻ� ���� ������");
		else
			System.out.println("�ٸ� �ν��Ͻ� ���� ������");
		
		if(studentLee.equals(studentSang))
			System.out.println("���� �ν��Ͻ� ���� ������");
		else
			System.out.println("�ٸ� �ν��Ͻ� ���� ������");
		//hashcode=>�ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode��: "+studentLee.hashCode());
		System.out.println("studentSang�� hashcode��: "+studentSang.hashCode());
		//�ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� �����ּҰ�: "+System.identityHashCode(studentLee));
		System.out.println("studentSang�� �����ּҰ�: "+System.identityHashCode(studentSang));
		}
	
}
