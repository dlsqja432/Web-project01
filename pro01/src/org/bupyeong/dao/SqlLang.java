package org.bupyeong.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// ǥ�� SQL
public interface SqlLang {
	String SELECT_ALL_NOTICE = "select * from notice order by resdate desc";
	String SELECT_NOTICE_BYNO = "select * from notice where no=?";
	String INSERT_NOTICE = "insert into notice values (nseq.nextval, ?, ?, sysdate, 0)";
	String UPDATE_NOTICE = "update notice set title=?, content=? where no=?";	
	String DELETE_NOTICE = "delete from notice where no=?";	
	String VISITED_UPDATE_NOTICE = "update notice set visited=visited+1 where no=?";

	String SELECT_ALL_MEMBER = "select * from member order by id";
	String SELECT_MEMBER_BYID = "select * from member where id=?";
	String SELECT_ONE_MEMBER = "select * from member where id=?";
	String INSERT_MEMBER = "insert into member values(?,?,?,?,?)";
	String UPDATE_MEMBER = "update member set pw=?, name=?, email=?, tel=? where id=?";
	String DELETE_MEMBER = "delete from member where id=?";
	
	Connection connect();
	void close(Connection con, PreparedStatement pstmt);
	void close(Connection con, PreparedStatement pstmt, ResultSet rs);
}
