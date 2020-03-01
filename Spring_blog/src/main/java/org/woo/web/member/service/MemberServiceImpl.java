package org.woo.web.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.woo.web.member.dao.MemberDAO;
import org.woo.web.member.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Inject
	private MemberDAO dao;
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}
	@Override
	public void mainSignUp(MemberVO vo) throws Exception {
		dao.mainSignUp(vo);
	}
	@Override
	public Integer checkId(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkId(vo);
	}
	@Override
	public Integer checkNickName(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkNickName(vo);
	}
}
