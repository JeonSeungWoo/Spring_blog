package org.woo.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO1Imple implements Test1DAO {
	@Inject 
	private SqlSession session;
	@Override
	public String time() throws Exception {
		return session.selectOne("test.time");
	}

}
