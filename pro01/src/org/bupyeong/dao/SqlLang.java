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
	
	String LATEST_QNA = "select * from (select * from qna order by parno desc, plevel asc) where rownum<=5";
	String SELECT_ALL_QNA = "select * from qna order by parno desc, plevel asc";
	String SELECT_QNA_BYNO = "select * from qna where no=?";
	String DELETE_ANSWER = "delete from qna where no=?";
	String DELETE_QUESTION = "delete from qna where parno=?";
	String UPDATE_QNA = "update qna set title=?, content=? where no=?";
	String INSERT_ANSWER = "insert into qna values(qseq.nextval, 2, ?, ?, ?, default, 0, ?)";
	String INSERT_QUESTION = "insert into qna values(qseq.nextval, 1, null, ?, ?, default, 0, ?)";
	String UPDATE_PARNO_QUESTION = "update qna set parno=qseq.currval where no = (select * from (select no from qna order by no desc) where rownum<=1)";
	String VISITED_UPDATE_QNA = "update qna set visited=visited+1 where no=?";
	
	String SELECT_ALL_TRAFFIC = "select * from traffic order by ttype desc, no asc";
	
	String DELETE_BOARD = "delete from board where no=?";
	String UPDATE_BOARD = "update board set title=?, content=? where no=?";
	String INSERT_BOARD = "insert into board values(bseq.nextval, ?, ?, default, 0, ?)";
	String SELECT_BOARD_BYNO = "select * from board where no=?";
	String VISITED_UPDATE_BOARD = "update board set visited=visited+1 where no=?";
	String SELECT_ALL_BOARD = "select * from board order by no desc";
	
	
	Connection connect();
	void close(Connection con, PreparedStatement pstmt);
	void close(Connection con, PreparedStatement pstmt, ResultSet rs);
}
