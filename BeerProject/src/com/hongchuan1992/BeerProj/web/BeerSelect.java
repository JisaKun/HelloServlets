package com.hongchuan1992.BeerProj.web;

import com.hongchuan1992.BeerProj.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Zhang Hongchuan on 2016/1/8.
 * Selector
 */
public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Color<br>");
        String s = request.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List<String> result = beerExpert.getBrands(s);
        String ss = getServletConfig().getInitParameter("adminEmail");      // ���ó�ʼ������
        String st = getServletContext().getInitParameter("adminEmail");
//        out.println(s);
//        for(String brand : result) {
//            out.println("<br> try:" + brand);
//        }

        request.setAttribute("styles", result); // Ϊ�����������һ�����Թ�jspʹ��
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");    // ΪJSPʵ����һ�����������
        view.forward(request, response);    // ʹ�����������Ҫ������׼����JSP�������������������Ӧ
    }
}
