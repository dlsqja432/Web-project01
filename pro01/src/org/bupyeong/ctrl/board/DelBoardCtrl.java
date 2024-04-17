package org.bupyeong.ctrl.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bupyeong.dao.BoardDAO;

@WebServlet("/DelBoard.do")
public class DelBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelBoardCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; char-set=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		BoardDAO dao = new BoardDAO();
		int cnt = dao.delBoard(no);
		
		if(cnt>=1) {
			response.sendRedirect("/pro01/BoardList.do");
		} else {
			response.sendRedirect("/pro01/GetBoard.do?no=" + no);
		}
	}
}
