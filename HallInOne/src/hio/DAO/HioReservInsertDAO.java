package hio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hio.domain.HioMember;

public class HioReservInsertDAO implements ReservInsertDAO {

	public int reservInsert(Connection conn, HioMember hioMember) throws SQLException {
		
		int result = 0;
		PreparedStatement pstmt = null;
		// 입력 처리
		String sql = "INSERT INTO RESERVATION VALUES(RESERVNO_SEQ.nextval, ?, ?, SYSDATE, ?)";
		
		
		System.out.println(hioMember.getHallNo());
		System.out.println(hioMember.getReservTime());
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, hioMember.getMemberNo());
			pstmt.setInt(2, hioMember.getHallNo());
			pstmt.setInt(3, hioMember.getReservTime());
//			
			result = pstmt.executeUpdate();
		}finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		System.out.println(result);
		return result;
	}

	
}
