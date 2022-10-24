package service;

import java.sql.SQLException;

import util.HioConnection;

public class HioUpdateService {

	UpdateDAO Updatedao  = new HioUpdateDao();
	
	public int update(HioMember hiomember) {
		
		int result = 0;
		HioConnection hioconn = null;
		
		try {
			hioconn = HioConnection.getConnection();
			
			result = Updatedao.update(hioconn, hiomember);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
