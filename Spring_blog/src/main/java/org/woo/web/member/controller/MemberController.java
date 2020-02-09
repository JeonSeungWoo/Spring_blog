package org.woo.web.member.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.woo.web.member.domain.MemberVO;
import org.woo.web.member.service.MemberService;

@RequestMapping("/member/*")
@Controller
public class MemberController {

	@Inject
	private MemberService service;

	// 로그인 폼을 띄우는 부분
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm"; // /login/loginForm.jsp를 띄움.
	}// end of loginForm

	// 로그인 처리하는 부분
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, MemberVO dto) throws Exception {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			// 기존에 login이란 세션 값이 존재한다면
			session.removeAttribute("login"); // 기존값을 제거해 준다.
		}

		// 로그인이 성공하면 MemberVO 객체를 반환함.
		MemberVO vo = service.login(dto);
		System.out.println(vo);
		if (vo != null) { // 로그인 성공
			session.setAttribute("login", vo); // 세션에 login인이란 이름으로 MemberVO 객체를 저장해 놈.
			returnURL = "redirect:/member/success"; // 로그인 성공시 게시글 목록페이지로 바로 이동하도록 하고
		} else { // 로그인에 실패한 경우
			returnURL = "redirect:/member/loginForm"; // 로그인 폼으로 다시 가도록 함
		}
		return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴
	}

	// 로그아웃 하는 부분
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // 세션 전체를 날려버림
		// session.removeAttribute("login"); // 하나씩 하려면 이렇게 해도 됨.
		return "redirect:/member/loginForm"; // 로그아웃 후 게시글 목록으로 이동하도록...함

	}
	
	@RequestMapping(value = "/success")
	public String success(HttpSession session) {
		
		return "member/success"; // 로그아웃 후 게시글 목록으로 이동하도록...함

	}
	
	

}
