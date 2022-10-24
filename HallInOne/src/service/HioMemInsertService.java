package service;

import java.sql.Connection;
import java.sql.SQLException;

import hio.dao.OracleMemInsertDao;
import hio.domain.HioMember;
import hio.util.ConnectionProvider;
import oracle.net.aso.c;

public class HioMemInsertService {
	
	OracleMemInsertDao dao;
	
	public HioMemInsertService(OracleMemInsertDao dao) {
		this.dao = dao;
	}
	
	public int memInsert(HioMember hioMem) {
		
		int result = 0;
		Connection conn = null;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			result = dao.memInsert(conn, hioMem);
			
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
