package service;

import java.sql.Connection;
import java.sql.SQLException;
import hio.DAO.HioMemberDeleteDAO;
import util.HioConnection;

public class HioMemberDeleteService {
	
	HioMemberDeleteDAO dao = new HioMemberDeleteDAO();
	
	public int memberDelete(String delName) {
		
		int result = 0;
		Connection conn = null;
		
		try {
			
			conn = HioConnection.getConnection();
			result = dao.memberDelete(conn, delName);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
		
	}
}
