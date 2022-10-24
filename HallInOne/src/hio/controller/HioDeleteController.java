package hio.controller;

import java.util.Scanner;
import service.HioDeleteService;
import service.HioInsertService;

public class HioDeleteController implements HioDeleteInterface {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void memberDeletet() {

		System.out.println("삭제할 회원 이름을 입력해주세요. >> ");
		String delName = sc.nextLine().trim();

		int result = new HioDeleteService().memberDelete(delName);
		
		if (result > 0) {
			System.out.println("회원 삭제 완료!");
		} else {
			System.out.println("회원 삭제 실패!");
		}

	}
}
