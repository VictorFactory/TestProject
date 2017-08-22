package com.xiaoyue.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 70883 on 2017/8/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/verifycode")
    @ResponseBody
    public String getVerifyCode(){
        return "000001";
    }
}
