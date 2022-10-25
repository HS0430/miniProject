package hio.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import hio.domain.HioMember;

public interface ReservInsertDAO {

	public int reservInsert(Connection conn, HioMember hioMember) throws SQLException;
	
}
