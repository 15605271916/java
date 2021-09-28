package day092801J2EE08servlet07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("test3");
		
		HttpSession session=req.getSession();
		
		System.out.println(session.getId());
		
		req.setAttribute("name", "bwf");
		
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		
		out.print("hello");
		
		out.print("<br/>");
		
		out.print("bwf");
		
		out.print("</html>");
		
//		out.flush();
//		
//		out.close();

		System.out.println("输出结束");
		
	}
	
}
