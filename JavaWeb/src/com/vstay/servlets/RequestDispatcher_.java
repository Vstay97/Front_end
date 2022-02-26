package com.vstay.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 演示服务器端内部转发以及客户端重定向
public class RequestDispatcher_ extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 服务端内部转发
        // System.out.println("正在内部转发");
        // request.getRequestDispatcher("RequestDispatcherDemo").forward(request,response);
        // 客户端重定向
        System.out.println("正在重定向");
        response.sendRedirect("RequestDispatcherDemo");
    }
}
