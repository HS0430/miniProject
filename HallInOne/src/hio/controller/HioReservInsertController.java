package hio.controller;

import java.util.Scanner;

import hio.HioMain;
import hio.domain.HioMember;
import service.HioMemberInsertService;
import service.HioReservInsertService;

public class HioReservInsertController implements HioReservInsertInterface{

	public int reservInsert() {
		
		int result = -1;
		
		HioMember hioMember = HioMain.hioMember;
		
		Scanner sc = new Scanner(System.in);

		
//		HALLNO
//		HALLRESVYN
//		HALLTIME
		
//		RESERVNO
//		MEMBERNO
//		HALLNO
//		RESERVDATE
//		RESERVTIME
			
			System.out.println("------------------------------------------------");
			System.out.println("-------------------- 타석예약 --------------------");
			
			System.out.println(hioMember.getMemberGrade());
			System.out.println(hioMember.getMemberNo());
			
			System.out.print("예약하실 홀 번호를 입력해주세요 >>");
			int hallno = Integer.parseInt(sc.nextLine());
			
			System.out.print("예약하실 시간을 입력해주세요 >>");
			int halltime = Integer.parseInt(sc.nextLine());
			
			hioMember.setHallNo(hallno);
			hioMember.setReservTime(halltime);
			
			result = new HioReservInsertService().reservInsert(hioMember);

		
			return result;
		}
}
