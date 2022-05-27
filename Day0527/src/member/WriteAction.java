package member;

import java.util.*;

public class WriteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("등록할 회원의 정보를 입력 하세요.");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.print("국적 : ");
		String nation = sc.next();

		System.out.print("전화번호 : ");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(age, name, tel, email, nation);
		addMember(member);
	}

	
	// 멤버 추가 저장 메소드
	private void addMember(MemberVO member) {
		MemberVO[] temp = new MemberVO[MemberMain.members.length+1];
		for(int i = 0; i < MemberMain.members.length; i++) {
			temp[i] = MemberMain.members[i];
		}
		temp[temp.length-1] = member;
		MemberMain.members = temp;
		
	}
}
