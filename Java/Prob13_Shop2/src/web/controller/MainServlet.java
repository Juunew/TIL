package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.MemberService;
import web.util.ShopException;
import web.vo.MemberVO;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	MemberService service;

	public void init() throws ServletException {
		service = new MemberService();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}
	
	// doHandler
	protected void myService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리 설정해주기
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 컨트롤링
		String sign  = request.getParameter("sign");
		
		// 회원가입과 로그인 처리해주기
		if(sign.equals("memberInsert")) {	// 회원가입 시
			// 회원가입하는 사람의 name, id, pw 파라미터값 받기
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			// 파라미터값을 vo에 삽입
			MemberVO vo = new MemberVO(id, pw, name);
			System.out.println(vo);
			
			// DB에 insert
			service.insertMember(vo);
			out.append(name + "님 가입환영합니다.");
		} else if(sign.equals("login")) {	// 로그인 시
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberVO vo = new MemberVO(id, pw);
			System.out.println(vo);
			
			// 회원가입정보와 로그인정보 DB에 insert
			try {
				String name = service.selectMember(vo);
				if(name != null) {
					out.append(name);
				} else {
					out.append("login 실패");
				}
			} catch (ShopException e) {
				// TODO Auto-generated catch block
				out.append(e.getMessage());
			}
		}
	}

}

