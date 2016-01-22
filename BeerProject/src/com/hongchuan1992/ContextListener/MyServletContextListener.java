package com.hongchuan1992.ContextListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Zhang Hongchuan on 2016/1/14.
 * ��������
 */
public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event){
        ServletContext context = event.getServletContext();     // ���¼��õ�Context

        String dogBreed = context.getInitParameter("breed");    // ��ȡ�����ĳ�ʼ������

        Dog d = new Dog(dogBreed);
        context.setAttribute("dog", d);
    }

    public void contextDestroyed(ServletContextEvent var1){

    }

}
