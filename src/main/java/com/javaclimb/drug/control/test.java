package com.javaclimb.drug.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @RequestMapping("/testString")
    @ResponseBody
    public String testString(){
        return "大家好";
    }
}
