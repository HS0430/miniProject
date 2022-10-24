package service;

import java.sql.Connection;
import java.sql.SQLException;

import hio.DAO.HioSelectDAO;
import hio.domain.HioMember;
import util.HioConnection;

public class HioSelectService {
	
	HioSelectDAO dao = new HioSelectDAO();

	
	public HioMember selectByDeptno(String MemberId) {
		
		HioMember hioMember = null;
		Connection conn = null;
		
		try {
			conn = HioConnection.getConnection();
			hioMember = dao.memberAll(conn, MemberId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return hioMember;
		
	}

	
	public int memberLogin(HioMember hioMember) {
		
		int result = 0;
		Connection conn = null;

		try {
			conn = HioConnection.getConnection();
			result = dao.memberLogin(conn, hioMember);
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
