package org.bupyeong.ctrl.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bupyeong.dao.BoardDAO;
import org.bupyeong.dto.Board;

/**
 * Servlet implementation class EditProBoardCtrl
 */
@WebServlet("/EditProBoard.do")
public class EditProBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditProBoardCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); char-set=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		int cnt = dao.editBoard(board);
		
		if(cnt >= 1) {
			response.sendRedirect("/pro01/BoardList.do");
		} else {
			response.sendRedirect("/pro01/GetBoard.do?no=" + no);
		}
	}
}
