package web.servlet.forAndDirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForWordServlet extends HttpServlet {

	//doGet����   servlet ---> html
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); //��֤post�ύ��ʽ��������
		resp.setCharacterEncoding("UTF-8"); //��֤��Ӧ�ı����ʽ
		resp.setContentType("text/html;charset=UTF-8"); //��������������ı����ʽ
		
		String name = req.getParameter("username");
		System.out.println(name);
		String page="";
		if("briup".equals(name)) {
			page = "/forwardA.html";
		}else {
			page = "/forwardB.html";
		}
		
		//��ȡ����ת��pageҳ�������ת����
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		//��ת��page
		dispatcher.forward(req, resp);
		
	}

	//doPost����   servlet -- > servlet
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); //��֤post�ύ��ʽ��������
		resp.setCharacterEncoding("UTF-8"); //��֤��Ӧ�ı����ʽ
		resp.setContentType("text/html;charset=UTF-8"); //��������������ı����ʽ
		
		String name = req.getParameter("username");
		System.out.println(name);
		String myServlet="";
		if("briup".equals(name)) {
			myServlet = "/forwardA";
		}else {
			myServlet = "/forwardB";
		}
		
		//��ȡ����ת��myServletҳ�������ת����
		RequestDispatcher dispatcher = req.getRequestDispatcher(myServlet);
		//��ת��page
		dispatcher.forward(req, resp);
	
	}
	
}