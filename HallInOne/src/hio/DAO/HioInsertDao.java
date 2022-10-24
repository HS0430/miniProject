package hio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hio.domain.HioMember;

public class HioInsertDao {

	public int insert(Connection conn, HioMember hioMember) throws SQLException {
		
		int result = 0;
		PreparedStatement pstmt = null;
		// 입력 처리
		String sql = "INSERT INTO dept VALUES(?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, hioMember.getDeptno());
//			pstmt.setString(2, hioMember.getDname());
//			pstmt.setString(3, hioMember.getLoc());
//			
			result = pstmt.executeUpdate();
		}finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return result;
	}
}
