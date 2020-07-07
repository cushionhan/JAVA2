package pk25.treemap;


import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee=new Member(1001,"������");
		Member memberPark=new Member(1002,"�չα�");
		Member memberSon=new Member(1003,"�ڼ���");
		Member memberHong=new Member(1004,"ȫ�浿");
		
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		
		
		memberTreeMap.showAllMember();
		
		Member memberDong=new Member(1004,"�ڱ浿");
		memberTreeMap.addMember(memberDong);
//		memberHashMap.addMember(memberLee);
//		memberHashMap.removeMember(1004);
		memberTreeMap.showAllMember();

	}

}
