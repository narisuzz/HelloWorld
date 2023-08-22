package com.example.demo4;

import com.sun.jdi.Value;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieTest")
public class cookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
               String name = cookie.getName();
               if("lastTime".equals(name)) {
                   flag = true;
                   Date date = new Date();
                   SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
                   String str_date = sdf.format(date);
                   System.out.println("编码前：" + str_date);
                   str_date = URLEncoder.encode(str_date,"utf-8");
                   System.out.println("编码后：" + str_date);
                   cookie.setValue(str_date);
                   cookie.setMaxAge(60*60*24*30);
                   response.addCookie(cookie);
                   String value = cookie.getValue();
                   System.out.println("编码前：" + value);
                   value = URLEncoder.encode(value,"utf-8");
                   System.out.println("编码后：" + value);
                   response.getWriter().write("上次访问的时间是：" + value);
                   break;
               }
            }
        }
        if(cookies == null || cookies.length == 0 || flag == false) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            System.out.println("编码前：" + str_date);
            str_date = URLEncoder.encode(str_date,"utf-8");
            System.out.println("编码后：" + str_date);
            Cookie cookie = new Cookie("lastTime",str_date);
            cookie.setMaxAge(60*60*24*30);
            response.addCookie(cookie);
            response.getWriter().write("欢迎首次访问");

        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}
