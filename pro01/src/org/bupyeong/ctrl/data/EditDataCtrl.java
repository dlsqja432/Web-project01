package org.bupyeong.ctrl.data;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bupyeong.dao.DataDAO;
import org.bupyeong.dto.Data;

@WebServlet("/EditData.do")
public class EditDataCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditDataCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); char-set=UTF-8");
		
		HttpSession session = request.getSession();
		String loginId = (String) session.getAttribute("sid");
		
		if(!loginId.equals("admin")) {
			response.sendRedirect("/DataList.do");
		}
		else {
			int no = Integer.parseInt(request.getParameter("no"));
			
			DataDAO dao = new DataDAO();
			Data data = new Data();
			data = dao.getData2(no);
			
			request.setAttribute("data", data);
			RequestDispatcher view = request.getRequestDispatcher("/data/editData.jsp");
			view.forward(request, response);
		}
	}	
}
