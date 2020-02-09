package org.woo.web.member.dao;

import org.woo.web.member.domain.MemberVO;

public interface MemberDAO {
	public MemberVO login(MemberVO vo)throws Exception;
}
