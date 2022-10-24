package hio.controller;

import java.util.Scanner;
import hio.dao.OracleMemDeleteDao;
import hio.service.HioMemDeleteService;

public class HioMemDeleteController {

	HioMemDeleteService service= new HioMemDeleteService(new OracleMemDeleteDao());
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
		System.out.println("삭제할 회원 이름을 입력해주세요. >> ");
		String delName = sc.nextLine().trim();
		
		int result = service.memDelete(delName);
		
		if (result > 0) {
			System.out.println("회원 삭제 완료!");
		} else {
			System.out.println("회원 삭제 실패!");
		}
		
		
	}
	
}
