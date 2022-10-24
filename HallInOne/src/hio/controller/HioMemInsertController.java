package hio.controller;

import java.util.Scanner;
import hio.dao.OracleMemInsertDao;
import hio.domain.HioMember;
import hio.service.HioMemInsertService;

public class HioMemInsertController {

	HioMemInsertService service = new HioMemInsertService(new OracleMemInsertDao());
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
//		MEMBERNO     NOT NULL NUMBER(38)    
//		MEMBERNAME            VARCHAR2(50)  
//		MEMBERADDRES          VARCHAR2(255) 
//		MEMBERPHONE           VARCHAR2(30)  
//		MEMBERID              VARCHAR2(50)  
//		MEMBERPWD             VARCHAR2(50)  
//		MEMBERGRADE           NUMBER(38) 
		
		System.out.println("회원 등록을 진행합니다.");
		System.out.println("아래 항목들을 입력해주세요.");
		System.out.print("회원 코드: >> ");
		int membercd = Integer.parseInt(sc.nextLine());
		
		System.out.print("회원 이름: >> ");
		String membername = sc.nextLine().trim();
		
		System.out.print("회원 주소: >> ");
		String memberaddres = sc.nextLine().trim();
		
		System.out.print("회원 전화번호: >> ");
		String memberphone = sc.nextLine().trim();
		
		System.out.print("회원 아이디: >> ");
		String memberid = sc.nextLine().trim();
		
		System.out.print("회원 패스워드: >> ");
		String memberpwd = sc.nextLine().trim();
		
		System.out.print("회원 등급: >> ");
		int membergrade = Integer.parseInt(sc.nextLine());
		
		HioMember hioMem = new HioMember();
		
		hioMem.setMemberNo(membercd);
		
//		int result = service.memInsert(hioMem);
		
		int result = 0;
		
		if (result > 0) {
			System.out.println("신규 등록 완료!");
		} else {
			System.out.println("신규 등록 실패!");
		}	
		
	}	
}
