package app.servlet;

import app.service.user.UserServiceI;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * servlet3.0注解与Spring整合
 * @author kevin.wang
 *
 */
@WebServlet(name="FirstServlet",urlPatterns={"/firstServlet","/MyServlet"},initParams={@WebInitParam(name="hello",value="world init....")})  
@WebInitParam(name="paraName",value="paraValue") 
public class ServletTest extends HttpServlet {

	private static final long serialVersionUID = 2667471722183766395L;

	private UserServiceI userService;
	
	@Override  
    public void init(ServletConfig config) throws ServletException {  
        System.out.println(config.getInitParameter("paraName"));  
        System.out.println(config.getInitParameter("hello"));  
    }  
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		ServletContext ctx = request.getServletContext();
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(ctx);
		userService = (UserServiceI) wac.getBean("userService");
		out.println(userService.getUserById(1).getName());  
		out.close();  
    }  
}
