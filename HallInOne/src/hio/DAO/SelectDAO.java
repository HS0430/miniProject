package hio.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import hio.domain.HioMember;

public interface SelectDAO {

	public int memberLogin(Connection conn, HioMember hioMember) throws SQLException;
}
