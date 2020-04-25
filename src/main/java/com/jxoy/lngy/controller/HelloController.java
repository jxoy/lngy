package com.jxoy.lngy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//1.自动识别扫描当前的类，把他当做spring的bean去管理，同时也识别他为controller，允许这个类去接受前端的请求
//2.查看请求的参数是什么，用
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="namek") String namea, Model model){//name是参数,namek为地址栏输入的参数名，namea是地址栏相当输入value
        model.addAttribute("namex",namea);//第一个namex值将传到hello.html页面页面的namex，第二个namea是上一行第二个namea
        return "hello";//这时候会自动去templates目录去找

    }
}
