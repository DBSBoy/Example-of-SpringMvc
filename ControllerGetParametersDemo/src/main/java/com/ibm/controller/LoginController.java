package com.ibm.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ibm.pojo.User;
import com.ibm.vo.UserVO;
@Controller
public class LoginController {
	    // ͨ�� HttpServletRequest �� HttpServletResponse �Լ� HTTPSession ����ȡ�����еĲ���
		@RequestMapping("/login")
		public void getParamByReq(HttpServletRequest request, HttpServletResponse response) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("method1-----");
			System.out.println(username);
			System.out.println(password);
			
			List<User>list=new ArrayList<>();
			User user=new User();
			user.setUsername(password);
			user.setPassword(password);
			list.add(user);
			System.out.println(user);
			
		}
		
		 // ͨ���򵥵�������������ȡ�����еĲ���
		@RequestMapping("/testBySimple")
		public void getParamBySimple(String username, String password) {
			System.out.println("method2-----");
			System.out.println(username);
			System.out.println(password);
		}
		
		//ͨ���򵥵�pojo�������ղ���
		@RequestMapping("/testByPojo")
		public void getParamByPojo(User user) {
			System.out.println("method3-----");
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}
		
		// ͨ����װ������ȡҳ����Ϣ
		@RequestMapping("/saveUserVO")
		public String saveUserVO(UserVO userVO) {
			System.out.println("method4-----");
			System.out.println("name:"+userVO.getUser().getUsername());
			System.out.println("age:"+userVO.getUser().getAge());
		/* return "userEdit"; */
			return "success";
		}
		
		//ͨ���������ͻ�ȡ �����û�id��������ɾ���û�
		@RequestMapping("/batchDelUser")
		public String batchDelUser(Integer[] userId) {
			
			for (int i = 0; i < userId.length; i++) {
				System.out.println(userId[i]);
			}
			
			return "userList";
		}

}
