package com.dxy.recruit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
        @ResponseBody
        @RequestMapping("name")
        public ModelAndView name(ModelAndView vm){
            vm.setViewName("Vue");
            return  vm;
        }
}
