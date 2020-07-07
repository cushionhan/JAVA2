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
		System.out.println(memberId+"가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();	//KeySet():Key값만 저장하고 있는 메서드
		while(ir.hasNext()) {
			int key=ir.next();	//key 저장
			Member member=treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
