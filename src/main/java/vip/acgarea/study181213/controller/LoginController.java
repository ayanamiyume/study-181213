package vip.acgarea.study181213.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam("username") String user,
                        @RequestParam("password")String passwd){
        System.out.println("用户名："+user);
        System.out.println("密码："+passwd);
        return "登录成功";
    }
}
