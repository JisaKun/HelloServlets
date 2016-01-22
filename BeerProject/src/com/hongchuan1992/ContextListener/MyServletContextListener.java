package com.hongchuan1992.ContextListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Zhang Hongchuan on 2016/1/14.
 * 监听者类
 */
public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event){
        ServletContext context = event.getServletContext();     // 由事件得到Context

        String dogBreed = context.getInitParameter("breed");    // 获取上下文初始化参数

        Dog d = new Dog(dogBreed);
        context.setAttribute("dog", d);
    }

    public void contextDestroyed(ServletContextEvent var1){

    }

}
