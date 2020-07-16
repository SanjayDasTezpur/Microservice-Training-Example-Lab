package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class QueueSenderServlet extends javax.servlet.http.HttpServlet
                                             
                                                 
    {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	                          throws ServletException, IOException 
	                          
	                          {
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		QueueSender sender = (QueueSender)ctx.getBean("jmsSender");sender.sendMesage();
		}
	}
