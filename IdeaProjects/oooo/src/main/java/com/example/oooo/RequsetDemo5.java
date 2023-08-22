package com.example.oooo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestDemo5")
public class RequsetDemo5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取前端传递的 GET 表单数据
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        // 将 ageStr 转换为整数
        int age = 0;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            // 处理转换异常
            // 这里可以给 age 一个默认值或者返回错误信息给前端
        }

        // 处理 GET 请求的代码
        // 使用获取到的表单数据进行相应的处理
        // ...

        // 返回响应结果（这里假设返回一个简单的响应）
        System.out.println("name:"+name + "\t"+"age:"+age);
    }
}
