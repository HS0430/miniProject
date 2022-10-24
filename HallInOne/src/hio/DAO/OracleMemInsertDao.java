package hio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hio.domain.HioMember;

public class OracleMemInsertDao {
	
	public int memInsert(Connection conn, HioMember hioMem) throws SQLException {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member values (?,?,?,?,?,?,?)";
		
		try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, hioMem.getMemberno());
		pstmt.setString(2, hioMem.getMembername());
		pstmt.setString(3, hioMem.getMemberaddres());
		pstmt.setString(4, hioMem.getMemberphone());
		pstmt.setString(5, hioMem.getMemberid());
		pstmt.setString(6, hioMem.getMemeberpwd());
		pstmt.setString(7, hioMem.getMembergreade());
		
		} finally {
			if (pstmt != null) pstmt.close();
		}
		
		return result;
		
	}

}
