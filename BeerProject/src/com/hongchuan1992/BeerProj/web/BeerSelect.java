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
        String ss = getServletConfig().getInitParameter("adminEmail");      // 设置初始化参数
        String st = getServletContext().getInitParameter("adminEmail");
//        out.println(s);
//        for(String brand : result) {
//            out.println("<br> try:" + brand);
//        }

        request.setAttribute("styles", result); // 为请求对象增加一个属性供jsp使用
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");    // 为JSP实例化一个请求分派器
        view.forward(request, response);    // 使用请求分派器要求容器准备好JSP并向容器发送请求和相应
    }
}
