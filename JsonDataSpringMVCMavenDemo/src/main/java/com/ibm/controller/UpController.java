package com.ibm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibm.model.User2;

@Controller
@RequestMapping("/up")
public class UpController {
	@RequestMapping("/logup")
    @ResponseBody
	 public List<User2> up(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		
		List<User2>list=new ArrayList<>();
		User2 user=new User2();
		user.setName(username);
		user.setPassword(password);
		user.setAge(Integer.parseInt(age));
		user.setPhone(phone);
		list.add(user);
		System.out.println(list);
		return list;
		
		 
	}
}
