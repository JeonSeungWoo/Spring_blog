package org.woo.web.member.dao;

import org.woo.web.member.domain.MemberVO;

public interface MemberDAO {
	public MemberVO login(MemberVO vo)throws Exception;
	public void mainSignUp(MemberVO vo)throws Exception ;
	public Integer checkId(MemberVO vo) throws Exception;
	public Integer checkNickName(MemberVO vo) throws Exception;
}
