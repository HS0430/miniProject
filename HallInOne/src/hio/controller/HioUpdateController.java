package hio.controller;

import java.sql.Connection;
import java.sql.SQLException;

import hio.HioMain;
import hio.domain.HioMember;
import service.HioUpdateService;

public class HioUpdateController implements HioUpdateInterface {

	HioUpdateService service = new HioUpdateService();

		
	public void MemberUpdate() {

		System.out.println("회원 정보를 변경합니다");

		System.out.println("수정할 회원 아이디를 입력하세요. >>");
		String memberId = HioMain.sc.nextLine();

		System.out.println("변경하실 회원 이름을 입력해주세요. >> ");
		String memberName = HioMain.sc.nextLine();

		System.out.println("변경하실 주소를 입력해주세요 >> ");
		String memberAddress = HioMain.sc.nextLine();

		System.out.println("변경하실 휴대폰 번호를 입력해주세요 >> ");
		String memberPhone = HioMain.sc.nextLine();

		int result = service.update(new HioMember(memberId, memberName, memberAddress, memberPhone));

		if (result > 0) {
			System.out.println("회원 정보가 변경되었습니다.");
		} else {
			System.out.println("다시 변경해주세요.");
		}

	}

	public void process() {

		System.out.println("예약을 변경합니다.");

		System.out.println("변경하실 홀번호를 입력해주세요. >> ");
		String hallNo = HioMain.sc.nextLine();

		System.out.println("변경하실 예약일자를 입력해주세요 >> ");
		String reservDate = HioMain.sc.nextLine();

		System.out.println("변경하실 예약시간을 입력해주세요 >> ");
		String reservTime = HioMain.sc.nextLine();

		int result = service.update(new HioMember(hallNo, reservDate, reservTime));

		if (result > 0) {
			System.out.println("예약이 변경되었습니다.");
		} else {
			System.out.println("예약을 다시 변경해주세요.");
		}

	}

}
