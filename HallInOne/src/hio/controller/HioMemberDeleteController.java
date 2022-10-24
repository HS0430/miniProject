package hio.controller;

import java.util.List;
import java.util.Scanner;

import hio.domain.HioMember;
import service.HioMemberDeleteService;
import service.HioInsertService;

public class HioMemberDeleteController implements HioMemberDeleteInterface {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void memberDeletet() {

		List<HioMember> allList = new HioMemberDeleteService().memberSelectToDelete();
		
		if (allList != null && !allList.isEmpty()) {
			
			for (HioMember h : allList) {
				System.out.println(h);
			}
		}
		
		System.out.println("삭제할 회원 이름을 입력해주세요. >> ");
		String delName = sc.nextLine().trim();

		int result = new HioMemberDeleteService().memberDelete(delName);
		
		if (result > 0) {
			System.out.println("회원 삭제 완료!");
		} else {
			System.out.println("회원 삭제 실패!");
		}

	}

}
