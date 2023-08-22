package com.example.zcc;

import com.example.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;

@RestController
public class rsdvs {
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String username, Integer age) {
        System.out.println(username + ":" + age);
        return "ok";
    }
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "ok";
    }
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
}
/*@RestController
public class rsdvs {
    @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = 0; // 默认值或根据你的业务逻辑设置合适的默认值
        if (ageStr != null && !ageStr.isEmpty()) {
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException e) {
                // 处理无法解析为数字的情况，例如返回错误信息或进行其他逻辑
            }
        }

        System.out.println(name + ":" + age);
        return "ok";
    }
}*/
