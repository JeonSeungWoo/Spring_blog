package org.woo.web.member.controller;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.woo.web.member.domain.MemberVO;
import org.woo.web.member.service.MemberService;

@RequestMapping("/member/*")
@Controller
public class MemberController {

	@Inject
	private MemberService service;

	// 濡쒓렇???쇱쓣 ?꾩슦??遺遺?
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm"; // /login/loginForm.jsp瑜??꾩?.
	}// end of loginForm

	// 濡쒓렇??泥섎━?섎뒗 遺遺?
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, MemberVO dto) throws Exception {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			// 湲곗〈??login?대? ?몄뀡 媛믪씠 議댁옱?쒕떎硫?湲곗〈媛믪쓣 ?쒓굅??以??
			session.removeAttribute("login");
		}

		// 濡쒓렇?몄씠 ?깃났?섎㈃ MemberVO 媛앹껜瑜?諛섑솚?쒕떎.
		MemberVO vo = service.login(dto);
		System.out.println(vo);
		// 濡쒓렇???깃났
		if (vo != null) {
			// ?몄뀡??login?몄씠? ?대쫫?쇰줈 MemberVO 媛앹껜瑜???ν빐 ?볥뒗??
			session.setAttribute("login", vo);
			// 濡쒓렇???깃났???대룞
			returnURL = "redirect:/member/success";
		} else {
			// 濡쒓렇?몄뿉 ?ㅽ뙣??寃쎌슦 ?대룞
			returnURL = "redirect:/member/loginForm";
		}
		return returnURL; // ?꾩뿉???ㅼ젙??returnURL ??諛섑솚?댁꽌 ?대룞?쒗궡
	}

	// 濡쒓렇?꾩썐 ?섎뒗 遺遺?
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // ?몄뀡 ?꾩껜瑜??좊젮踰꾨┝
		// session.removeAttribute("login"); // ?섎굹???섎젮硫??대젃寃??대룄 ??
		return "redirect:/member/loginForm"; // 濡쒓렇?꾩썐 ??寃뚯떆湲 紐⑸줉?쇰줈 ?대룞?섎룄濡??쒕떎.
	}

	@RequestMapping(value = "/success")
	public String success(HttpSession session) {
		return "member/success"; // 濡쒓렇?꾩썐 ??寃뚯떆湲 紐⑸줉?쇰줈 ?대룞?섎룄濡?..??
	}

	// ?뚯썝媛????
	@RequestMapping(value = "/mainSignUpForm", method = RequestMethod.GET)
	public String mainSignUpForm() throws Exception {
		
		return "/member/mainSignUpForm";
	}

	// ?뚯썝媛??湲곕뒫
	@RequestMapping(value = "/mainSignUp", method = RequestMethod.POST)
	public String mainSignUp(Model model, MemberVO vo) throws Exception {
		service.mainSignUp(vo);
		return "redirect:/member/loginForm";
	}

	@RequestMapping(value = "/checkKey", method = RequestMethod.POST)
	public void checkKey(HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
		PrintWriter out = res.getWriter();

		try {
			String parmid = (req.getParameter("key") == null) ? "" : String.valueOf(req.getParameter("key"));

			System.out.println(req.getParameter("key"));
			MemberVO vo = new MemberVO();
			vo.setKey(parmid.trim());
			Integer checkPoint = service.checkId(vo);

			System.out.println(checkPoint);
			out.print(checkPoint);
			out.flush();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
			out.print("1");

		}
	}

	@RequestMapping(value = "/checkNickName", method = RequestMethod.POST)
	public Integer checkNickName(HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
		String parmid = (req.getParameter("nickName") == null) ? "" : String.valueOf(req.getParameter("nickName"));
		MemberVO vo = new MemberVO();
		vo.setNickname(parmid.trim());
		Integer checkPoint = service.checkId(vo);

		return checkPoint;
	}

}
