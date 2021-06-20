package web.service;

import web.dao.MemberDAO;
import web.util.ShopException;
import web.vo.MemberVO;

public class MemberService {
	// dao 객체 생성
	MemberDAO dao;
	
	// 생성된 dao 객체에 MemberService 담아 보내기
	public MemberService() {
		dao = new MemberDAO();
	}

	// MemberVO를 vo에 담고 vo를 insertMember에 담고 MemberVO가 담긴 insertMember를 생성된 dao객체에 담아 MemberDAO로 보냄
	public void insertMember(MemberVO vo) {
		dao.insertMemeber(vo);
	}

	public String selectMember(MemberVO vo) throws ShopException {
		return dao.selectMember(vo);
	}
	
	
}
