package com.hongchuan1992.ContextListener;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Zhang Hongchuan on 2016/1/14.
 */
public class ListenerTester extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        writer.println("<br>"+dog.getBreed()+"<br>");
    }
}
