package org.bupyeong.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bupyeong.dao.NoticeDAO;
import org.bupyeong.dto.Notice;

@WebServlet("/EditProNotice.do")
public class EditProNoticeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditProNoticeCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Notice noti = new Notice();
		noti.setNo(Integer.parseInt(request.getParameter("no")));
		noti.setTitle(request.getParameter("title"));
		noti.setContent(request.getParameter("content"));
		NoticeDAO dao = new NoticeDAO();
		int cnt = dao.editNotice(noti);
		response.sendRedirect("/pro01/NoticeList.do");
	}
}
