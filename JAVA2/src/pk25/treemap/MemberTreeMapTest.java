package pk25.treemap;


import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee=new Member(1001,"이지원");
		Member memberPark=new Member(1002,"손민국");
		Member memberSon=new Member(1003,"박서훤");
		Member memberHong=new Member(1004,"홍길동");
		
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		
		
		memberTreeMap.showAllMember();
		
		Member memberDong=new Member(1004,"박길동");
		memberTreeMap.addMember(memberDong);
//		memberHashMap.addMember(memberLee);
//		memberHashMap.removeMember(1004);
		memberTreeMap.showAllMember();

	}

}
