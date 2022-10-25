package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import hio.DAO.AllMemberDao;
import hio.domain.HioMember;
import util.HioConnection;

public class HioAllMemberService {

	AllMemberDao allmemberdao;

	public HioAllMemberService(AllMemberDao allmemberdao) {
		this.allmemberdao = allmemberdao;
	}

	public List<HioMember> selectList() {

		List<HioMember> list = null;
		Connection conn = null;

		try {
			conn = HioConnection.getConnection();
			list = allmemberdao.selectList(conn);

		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
			return list;

		

	}

}
