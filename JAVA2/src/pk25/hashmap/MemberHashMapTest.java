package pk25.hashmap;

import pk26.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee=new Member(1001,"������");
		Member memberPark=new Member(1002,"�չα�");
		Member memberSon=new Member(1003,"�ڼ���");
		Member memberHong=new Member(1004,"ȫ�浿");
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		
		memberHashMap.showAllMember();
		
		Member memberDong=new Member(1004,"�ڱ浿");
		memberHashMap.addMember(memberDong);
//		memberHashMap.addMember(memberLee);
//		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
	}

}
