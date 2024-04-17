package org.bupyeong.ctrl.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bupyeong.dao.BoardDAO;
import org.bupyeong.dto.Board;

@WebServlet("/BoardIns.do")
public class BoardInsCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardInsCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); char-set=UTF-8");
		
		HttpSession session = request.getSession();
		String aid = (String) session.getAttribute("sid");
		
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		board.setAid(aid);
		
		BoardDAO dao = new BoardDAO();
		int cnt = dao.insBoard(board);
		
		if(cnt >= 1) {
			response.sendRedirect("/pro01/BoardList.do");
		} else {
			response.sendRedirect("/board/board_ins.jsp");
		}
	}
}