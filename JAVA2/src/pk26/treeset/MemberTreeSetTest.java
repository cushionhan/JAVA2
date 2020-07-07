package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member member1=new Member(1,"°¡");
		Member member2=new Member(2,"³ª");
		Member member3=new Member(3,"´Ù");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		
		memberTreeSet.showAllMember();
	}

}
