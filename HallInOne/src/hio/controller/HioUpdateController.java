package hio.controller;

import java.sql.Connection;
import java.sql.SQLException;

import hio.HioMain;
import hio.domain.HioMember;
import service.HioUpdateService;

public class HioUpdateController implements HioUpdateInterface {

	HioUpdateService service = new HioUpdateService();	
	
	
	public void process() {
		
		System.out.println("예약 변경을 시작합니다.");
		
		System.out.println("변경하실 홀번호를 입력해주세요. >> ");
		String hallNo = HioMain.sc.nextLine();
		
		System.out.println("변경하실 예약일자를 입력해주세요 >> ");
		String reservDate = HioMain.sc.nextLine();
		
		System.out.println("변경하실 예약시간을 입력해주세요 >> ");
		String reservTime = HioMain.sc.nextLine();
		
		
		int result = service.update(new HioMember(hallNo, reservDate, reservTime));
		
		if(result > 0) {
			System.out.println("예약이 변경되었습니다.");
		} else {
			System.out.println("예약을 다시 변경해주세요.");
		}
		
	}
	
}
