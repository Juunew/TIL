package web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.util.ShopException;
import web.vo.MemberVO;

public class MemberDAO {
	
	// 드라이버 등록해주기
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
		}
	}
	
	// Create
	public void insertMemeber(MemberVO vo) {
		// 로컬변수 초기화 해주고
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 드라이버에 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "JES", "1234");
			
			// Statement 생성
			pstmt = conn.prepareStatement("Insert into users (id, pw, name, address, age) values (?, ?, ?, ?, ?)");
			
			// SQL 전송
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.setInt(5, vo.getAge());
			
			// update 해주기
			int row = pstmt.executeUpdate();
			
			// 결과확인
			System.out.println(row + "행이 입력되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	// Read
	public String selectMember(MemberVO vo) throws ShopException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "JES", "1234");
			pstmt = conn.prepareStatement("select name from users where id = ? and pw = ?");
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getString("name");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ShopException("login 실패");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	// Update
	public void updateMember(MemberVO vo) {
		
	}
	
	// Delete
	public void deleteMember(MemberVO vo) {
		
	}
}
