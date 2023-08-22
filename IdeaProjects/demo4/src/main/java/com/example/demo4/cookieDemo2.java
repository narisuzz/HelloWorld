package com.example.demo4;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/CookieDemo2")
public class cookieDemo2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取客户端发送的所有 Cookie
        Cookie[] cookies = request.getCookies();

        // 检查是否存在 Cookie
        if (cookies != null) {
            // 遍历所有 Cookie
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();

                // 在服务器端打印 Cookie 的名称和值
                System.out.println("Cookie Name: " + name + ", Value: " + value);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}