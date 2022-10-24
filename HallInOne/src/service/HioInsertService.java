package service;

import java.sql.Connection;
import java.sql.SQLException;

import hio.DAO.HioInsertDao;
import hio.domain.HioMember;
import util.HioConnection;


public class HioInsertService {
	HioInsertDao dao = new HioInsertDao();
	
	public int memberInsert(HioMember hioMember) {
		
		int result = 0;
		Connection conn = null;

		try {
			conn = HioConnection.getConnection();
			result = dao.insert(conn, hioMember);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
}
