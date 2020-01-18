package org.woo.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBTest {
	
//	@Test
//	public void OrcleDBConnectionTest() throws Exception {
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	Connection con = DriverManager.getConnection(
//	"jdbc:oracle:thin:@192.168.0.33:1521:orcl",
//	"orcl",
//	"1234");
//	System.out.println(con);
//	con.close();
//	}

	@Test
	public void postgresDBConnectionTest() throws Exception {
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection(
	"jdbc:postgresql://localhost:5432/postgres",
	"postgres",
	"1234");
	System.out.println(con);
	con.close();
	}
	
//	@Test
//	public void MysqlDBConnectionTest() throws Exception {
//    //mysql driver name 5version
//	//com.mysql.jdbc.Driver
//	//8버전 부터 driver name이 변경 되었고 Timezone을 설정하도록 변경 되었다.
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection(
//	"jdbc:mysql://localhost:3306/blog?useSSL=false&serverTimezone=Asia/Seoul",
//	"blog",
//	"1234");
//	System.out.println(con);
//	con.close();
//	}
}
