package pk25.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import pk26.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	//인스턴스형식으로 필드선언
	
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
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;	
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator();	//KeySet():Key값만 저장하고 있는 메서드
		while(ir.hasNext()) {
			int key=ir.next();	//key 저장
			Member member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
