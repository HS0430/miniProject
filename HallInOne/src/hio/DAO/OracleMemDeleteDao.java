package hio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleMemDeleteDao {

	public int memDelete(Connection conn, String delName) throws SQLException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = "delete from member where membername=?";

		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, delName);

			result = pstmt.executeUpdate();

		} finally {
			if (pstmt != null) pstmt.close();
		}

		return result;
	}
}
