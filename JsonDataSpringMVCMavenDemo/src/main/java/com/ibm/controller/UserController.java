package com.ibm.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ibm.model.User;
@Controller
@RequestMapping("/user")
public class UserController {
	    //����map�������ݷ���Json
	    @RequestMapping("/test")
	    @ResponseBody
	    public Map<String, Object> test(){
	        Map<String , Object> map = new HashMap<String ,Object>();
	        map.put("id", "ibm");
	        map.put("name", "CC");
	        System.out.println(map);
	        return map;
	    }
	    
	    //����list�������ݷ���Json
	    @RequestMapping("/test1")
	    @ResponseBody
	    public List<String> test1(){
	        List<String> list = new ArrayList<>();
	        list.add("aaa");
	        list.add("bbb");
	        list.add("ccc");
	        return list;
	    }

        //���Զ����ʽ��Json����
	    @RequestMapping("/test2")
	    @ResponseBody
	    public User test2(){
	        User user = new User();
	        user.setUsername("JiangMenTrain");
	        user.setAge(25);
	        return user;
	    }
	    
	  

	    //�����б���Json
	    @RequestMapping("/test3")
	    @ResponseBody
	    public List<User> test3(){
	        List<User> list = new ArrayList<>();
	        
	        User user1 = new User();
	        user1.setId(1);
	        user1.setUsername("CC");
	        user1.setAge(21);
	        list.add(user1);
	        
	        User user2 = new User();
	        user2.setId(2);
	        user2.setUsername("CSX");
	        user2.setAge(21);
	        list.add(user2);
	        
	        return list;
	    }

	    /**
	     * �����쳣����
	     * @return
	     */
	    @RequestMapping("/testExceptionHandlerExceptionResolver")
	    public String testExceptionHandlerExceptionResolver(@RequestParam("i")  int i){
	        System.out.println("result: " + (10 / i));
	        return "success";
	    }
	   
	   
}
