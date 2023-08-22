package com.example.demo4;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/CookieDemo1")
public class cookieDemo1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 创建一个名为 "username" 的 Cookie，并设置值为 "JohnDoe"
        Cookie cookie = new Cookie("username", "JohnDoe");

        // 设置 Cookie 的有效期，这里设置为 1 小时（单位是秒）
        //cookie.setMaxAge(3600);

        // 将 Cookie 添加到响应中
        response.addCookie(cookie);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}
