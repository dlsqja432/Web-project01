package org.bupyeong.ctrl.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bupyeong.dao.BoardDAO;
import org.bupyeong.dto.Coment;

@WebServlet("/ComentIns.do")
public class ComentInsCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ComentInsCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; char-set=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String content = request.getParameter("content");
		String aid = request.getParameter("aid");
		
		Coment coment = new Coment();
		coment.setNo(no);
		coment.setContent(content);
		coment.setAid(aid);
		
		BoardDAO dao = new BoardDAO();
		int cnt = dao.insComent(coment);
		
		if(cnt >= 1) {
			response.sendRedirect("/pro01/GetBoard.do?no=" + no);
		} else {
			response.sendRedirect("/pro01");
		}
	}
}