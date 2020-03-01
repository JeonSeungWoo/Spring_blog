package org.woo.web.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.woo.web.member.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession session;
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return session.selectOne("member.login", vo);
	}
	@Override
	public void mainSignUp(MemberVO vo) throws Exception {
		session.insert("member.mainSignUp",vo);
	}
	@Override
	public Integer checkId(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("member.checkKey", vo);
	}
	@Override
	public Integer checkNickName(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("member.checkNickname", vo);
	}
	
	
}
