package org.bupyeong.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.bupyeong.dto.Board;
import org.bupyeong.dto.Qna;

public class BoardDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<>();
		
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_ALL_BOARD);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board(rs.getInt("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("resdate"),
						rs.getInt("visited"),
						rs.getString("aid"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		
		return boardList;
	}
	
	public Board getBoard(int no) {
		Board board = new Board();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.VISITED_UPDATE_BOARD);
			pstmt.setInt(1, no);
			int cnt = pstmt.executeUpdate();
			pstmt = null;
			
			pstmt = con.prepareStatement(SqlLang.SELECT_BOARD_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setResdate(rs.getString("resdate"));
				board.setVisited(rs.getInt("visited"));
				board.setAid(rs.getString("aid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		
		return board;
	}
	
	public Board getBoard2(int no) {
		Board board = new Board();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_BOARD_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setResdate(rs.getString("resdate"));
				board.setVisited(rs.getInt("visited"));
				board.setAid(rs.getString("aid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		
		return board;
	}
	
	public int insBoard(Board board) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.INSERT_BOARD);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getAid());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
//	public int insAnswer(Qna qna) {
//		int cnt = 0;
//		OracleDB oracle = new OracleDB();
//		try {
//			con = oracle.connect();
//			pstmt = con.prepareStatement(SqlLang.INSERT_ANSWER);
//			pstmt.setInt(1, qna.getParno());
//			pstmt.setString(2, qna.getTitle());
//			pstmt.setString(3, qna.getContent());
//			pstmt.setString(4,qna.getAid());
//			cnt = pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			oracle.close(con, pstmt);
//		}
//		return cnt;
//	}

	public int editBoard(Board board) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.UPDATE_BOARD);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNo());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
	public int delBoard(int no) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.DELETE_BOARD);
			pstmt.setInt(1, no);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
//	public int delAnswer(int no) {
//		int cnt = 0;
//		OracleDB oracle = new OracleDB();
//		try {
//			con = oracle.connect();
//			pstmt = con.prepareStatement(SqlLang.DELETE_ANSWER);
//			pstmt.setInt(1, no);
//			cnt = pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			oracle.close(con, pstmt);
//		}
//		return cnt;
//	}
}
