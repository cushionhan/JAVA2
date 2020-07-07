package pk25.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import pk26.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	//�ν��Ͻ��������� �ʵ弱��
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;	
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator();	//KeySet():Key���� �����ϰ� �ִ� �޼���
		while(ir.hasNext()) {
			int key=ir.next();	//key ����
			Member member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}