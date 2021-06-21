package web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import web.util.ShopException;
import web.vo.MemberVO;

public class MemberDAO {
	
	DataSource ds;
	
	public MemberDAO()  {
		// 1. ConnectionPool 찾기
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			ds = (DataSource) envCtx.lookup("jdbc/MyDB");	// ConnectionPool
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Create
	public void insertMemeber(MemberVO vo) {
		// 로컬변수 초기화 해주고
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 드라이버에 연결
			conn = ds.getConnection();	// 대여
			
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 종료
			try {
				pstmt.close();
				conn.close();	// 반납
			} catch (Exception e) {
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
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("select name from users where id = ? and pw = ?");
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getString("name");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ShopException("login 실패");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
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
