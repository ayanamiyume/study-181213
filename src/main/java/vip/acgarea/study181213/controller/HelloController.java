package vip.acgarea.study181213.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello")
    public String hello(){
        return "hello world!";
    }

    @GetMapping("/test1")
//    @RequestMapping(path = "/test1",method = RequestMethod.GET)
    public String test1(){
        return "这是个测试";
    }

    @PostMapping("/test2")
//    @RequestMapping(path = "/test2",method = RequestMethod.POST)
    public String test2(){
        return "this is test2";
    }
}
