package study;

public class Test003 {

	public static void main(String[] args) {
		//이름 전공 고향 취미 특기 전화번호 성별 주소 좌우명

		String name = "장이빈",
				magor = "컴퓨터",
				hometown = "경기도 안양시",
				hobby = "게임",
				gender = "남성",
				address = "서울시 영등포구",
				motto = "효율적으로 열심히 하자",
				age = "23";
		
		
		System.out.printf("제 이름은 %s이고 나이는 %s입니다. %s에 살고있으며 전공은 %s이며 고향은 %s입니다. "
				+ "취미는 %s이고 성별은 %s이며 좌우명은 %s입니다.", name, age, address, magor, hometown, hobby, gender, motto );
	}
}
