package pk25.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import pk26.Member;

public class MemberTreeMap {

	private TreeMap<Integer,Member> treeMap;
	
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(),member);
	}
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();	//KeySet():Key���� �����ϰ� �ִ� �޼���
		while(ir.hasNext()) {
			int key=ir.next();	//key ����
			Member member=treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
