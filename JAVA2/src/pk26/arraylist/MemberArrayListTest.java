package pk26.arraylist;
import pk26.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberLee = new Member(1004,"������");
		Member memberSon = new Member(1003,"�չα�");
		Member memberPark = new Member(1002,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
	
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberLee.getMemberId());
		memberArrayList.showAllMember();

	}

}
