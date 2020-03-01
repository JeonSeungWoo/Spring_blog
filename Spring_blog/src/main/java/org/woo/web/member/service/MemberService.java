package org.woo.web.member.service;

import org.woo.web.member.domain.MemberVO;

public interface MemberService {
	public MemberVO login(MemberVO vo)throws Exception;
	public void mainSignUp(MemberVO vo) throws Exception;
	public Integer checkId(MemberVO vo) throws Exception;
	public Integer checkNickName(MemberVO vo) throws Exception;
}
