package hio.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import hio.domain.HioMember;

public class MySqlDao implements AllMemberDao {

	@Override
	public List<HioMember> selectList(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HioMember selectBymemberNo(Connection conn, int memberNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
