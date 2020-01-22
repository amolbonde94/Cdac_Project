package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.conn.MyConn;
import com.cdac.dto.User;
import com.cdac.service.ServiceInterface;
import com.cdac.service.ServiceInterfaceImple;

@Controller
public class HelloController1 {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private ServiceInterface serviceInterface=new ServiceInterfaceImple() ;
	
	  @GetMapping("/signup")
		 
		public ModelAndView signUpPage() {
			MyConn obj = new MyConn();
			obj.setJdbcTemplate(jdbcTemplate);
			System.out.println(jdbcTemplate);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signup");
			
			
			return mv;
		}
		
		
		@PostMapping("/signup")
		public ModelAndView registerUserToDb(User user) {
			System.out.println(user.getCity());
			boolean b = serviceInterface.create(user);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signin");
			
			
			return mv;
		}
}
