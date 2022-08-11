package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class HamburgerGameDAO {

	// 1. 필드
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	Random rd = new Random();

	// 2. 메소드
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_1_0418_3";
			String password = "smhrd3";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 자원 반납 메소드
	public void getClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("자원반납시 생긴 오류!");
		}

	}

	// 1. 이지 게임
	public ArrayList<Hamburger> easyGame() {
		ArrayList<Hamburger> list = new ArrayList<Hamburger>();
		ArrayList<Hamburger> easyQ = new ArrayList<Hamburger>();
		try {
			getConn();

			String sql = "select * from easy";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int e_num = rs.getInt("e_num");
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger easy = new Hamburger(e_num, menu, recipe);
				list.add(easy);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");
		} finally {
			getClose();
		}

		try {
			getConn();
			int index = rd.nextInt(list.size() - 1);
			String sql = "select menu, recipe from easy where e_num = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index);
			rs = psmt.executeQuery();

			if (rs.next()) {
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger easyq = new Hamburger(menu, recipe);
				easyQ.add(easyq);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return easyQ;
	}
	
	
	// 2. 노말 게임
	public ArrayList<Hamburger> normalGame() {
		ArrayList<Hamburger> list = new ArrayList<Hamburger>();
		ArrayList<Hamburger> normalQ = new ArrayList<Hamburger>();
		try {
			getConn();
			String sql = "select * from normal";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int n_num = rs.getInt("n_num");
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger normal = new Hamburger(n_num, menu, recipe);
				list.add(normal);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");
		} finally {
			getClose();
		}

		try {
			getConn();
			int index = rd.nextInt(list.size() - 1);
			String sql = "select menu, recipe from normal where n_num = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index);
			rs = psmt.executeQuery();

			if (rs.next()) {
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger normalq = new Hamburger(menu, recipe);
				normalQ.add(normalq);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return normalQ;
	}

	// 3. 하드 게임
	public ArrayList<Hamburger> hardGame() {
		ArrayList<Hamburger> list = new ArrayList<Hamburger>();
		ArrayList<Hamburger> hardQ = new ArrayList<Hamburger>();
		try {
			getConn();
			String sql = "select * from hard";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int h_num = rs.getInt("h_num");
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger hard = new Hamburger(h_num, menu, recipe);
				list.add(hard);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");
		} finally {
			getClose();
		}

		try {
			getConn();
			int index = rd.nextInt(list.size() - 1);
			String sql = "select menu, recipe from hard where h_num = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index);
			rs = psmt.executeQuery();

			if (rs.next()) {
				String menu = rs.getString("menu");
				String recipe = rs.getString("recipe");

				Hamburger hardq = new Hamburger(menu, recipe);
				hardQ.add(hardq);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return hardQ;
	}

}

//		String sql = "select * from easy where e_num = ?";
//		psmt = conn.prepareStatement(sql);
