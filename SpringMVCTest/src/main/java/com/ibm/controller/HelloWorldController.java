package com.ibm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.pojo.Student;
 
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView showMessage() {
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("massage", "spring MVC");
    	mv.setViewName("hello");
        return mv;
    }
    
    @RequestMapping("/sayHello")
    public String redirectHello(Model model) {
    	model.addAttribute("massage", "spring MVC");
        return "hello";
    }
    
    @RequestMapping("/hello2")
    public ModelAndView hello2(HttpServletRequest request) {
    	ModelAndView mv = new ModelAndView();
    	String massage = request.getParameter("massage");
    	mv.addObject("massage", massage);
    	mv.setViewName("hello");
        return mv;
    }
    
    @RequestMapping("/redirectHello")
    public String redirectHello(HttpServletRequest request) {
        return "redirect:/hello2";
    }
    
    @RequestMapping("/forwardHello")
    public String forwardHello(HttpServletRequest request) {
        return "forward:/hello2";
    }
    
    @RequestMapping("/hello3")
    public String hello3(@RequestParam(required = false, value="massage") String massage, Model model) {
    	model.addAttribute("massage", massage);
        return "hello";
    }
    
    @RequestMapping("/hello4")
    public String hello4(@RequestParam(value="massage") String massage, Model model) {
    	model.addAttribute("massage", massage);
        return "hello";
    }
    
    @RequestMapping("/hello5/{massage}")
    public String hello5(@PathVariable String massage, Model model) {
    	model.addAttribute("massage", massage);
        return "hello";
    }
    
    @RequestMapping("/hello6/{massage}/{id}")
    public String hello6(@PathVariable String massage,@PathVariable int id, Model model) {
    	model.addAttribute("massage", massage + id);
        return "hello";
    }
    
    @RequestMapping("/hello7/{massage}/{id}")
    public String hello7(@PathVariable String massage,@PathVariable int id,
    		@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date birthday ,Model model) {
    	model.addAttribute("massage", massage + id + " birthday is :" + birthday);
        return "hello";
    }

    @RequestMapping("/student/add")
    public String add(@ModelAttribute Student stu, Model model) {
    	model.addAttribute("massage", stu);
        return "hello";
    }
    
    @RequestMapping("/student/add2")
    @ResponseBody
    public Student add2(Student stu, Model model) {
        return stu;
    }
    
    
    
    
    @RequestMapping(value="/helloPost", method=RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request, Model model) {
    	String massage = request.getParameter("massage");
    	return "action successfully: " + massage;
    }
   
}