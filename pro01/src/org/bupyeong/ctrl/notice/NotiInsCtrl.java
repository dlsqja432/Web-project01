package org.bupyeong.ctrl.notice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bupyeong.dao.NoticeDAO;
import org.bupyeong.dto.Notice;

@WebServlet("/NotiIns.do")
public class NotiInsCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NotiInsCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); char-set=UTF-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Notice noti = new Notice();
		
		noti.setTitle(title);
		noti.setContent(content);
		
		NoticeDAO dao = new NoticeDAO();
		int cnt = dao.insNotice(noti);
		
		if(cnt > 0) {
			System.out.println("공지사항 추가 성공~!");
		} else {
			System.out.println("공지사항 추가 실패~!");
		}
		
		// 공지사항 추가후 목록 화면 다시 출력
//		List<Notice> notiList = new ArrayList<>();
//		notiList = dao.getNoticeList();
//		request.setAttribute("notiList", notiList);
//		RequestDispatcher view = request.getRequestDispatcher("/notice/noticeList.jsp");
//		view.forward(request, response);
		
		ServletContext application = request.getServletContext();
		String home = application.getContextPath();
		if(cnt>0) {
			response.sendRedirect(home+"/NotiList.do");
		} else {
			response.sendRedirect(home+"/notice/noti_ins.jsp");
		}
	}
}
