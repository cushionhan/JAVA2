package pk26.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;	//ArrayList ���� 
	
	public MemberArrayList(){
		arrayList=new ArrayList<Member>();	//����� ������ ArrayList�� �ν��Ͻ�ȭ ��
	}
	
	public void addMember(Member member) {	//ArrayList�� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {	//��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		for(int i=0;i<arrayList.size();i++) {
			Member member=arrayList.get(i);	//�ش� ���̵� ���� ����� ArrayList���� ã��
			int tempid=member.getMemberId();
			if(tempid==memberId) {	//������̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);//�ش� ����� ����
				return true;		//true��ȯ
			}
		}
//		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
//		return false;
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()){
			Member member = ir.next();
			int tempid=member.getMemberId();
			if(tempid==memberId) {	//������̵� �Ű���ȭ�� ��ġ�ϸ�
				arrayList.remove(member);	//�ش� ����� ����
				return true;//true��ȯ
			}
		}
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		System.out.println(arrayList);
	}
}
