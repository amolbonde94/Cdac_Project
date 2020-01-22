package com.cdac.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.conn.MyConn;
import com.cdac.dao.UserDao;
import com.cdac.dto.User;
import com.cdac.service.ServiceInterface;
import com.cdac.service.ServiceInterfaceImple;


@Controller
public class HelloController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	private ServiceInterface serviceInterface=new ServiceInterfaceImple() ;
	
	
	
	
	
	
	@GetMapping("/signin")
	public ModelAndView signinPage(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		if(request.getSession().getAttribute("UserName")!=null) {
			Integer i = (Integer)request.getSession().getAttribute("RollID");
			if(i==3) 
			{
					mv.setViewName("admin");
				
			}
			else if(i==1) 
			{
				mv.setViewName("farmer");
			}
			else {
				mv.setViewName("Customer");
			}
			
		}else
		    mv.setViewName("signin");
		
		return mv;
	}
	
	@GetMapping("/signout")
	public ModelAndView signOut(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		request.getSession().invalidate();
		mv.setViewName("signin");
		return mv;
	}
	
	
	@PostMapping("/signin")
	public ModelAndView validateUser(User user, HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		try {
			MyConn obj = new MyConn();
			obj.setJdbcTemplate(jdbcTemplate);
			
			User dbuser = serviceInterface.login(user);
		
		if(dbuser!=null) {
			request.getSession().setAttribute("UserName",dbuser.getUsername());
			request.getSession().setAttribute("RollID",dbuser.getRoll_id());
			if(dbuser.getRoll_id()==3) 
			{
					mv.setViewName("admin");
				
			}
			
			else if(dbuser.getRoll_id()==1) 
			{
				mv.setViewName("farmer");
			}
			else {
				mv.setViewName("Customer");
			}
		}
		else
		    mv.setViewName("signin");
	 
		return mv;
		
		} catch(Exception e) 
		{
			mv.setViewName("signin");
		}
		
		return mv;
		
	}
	
	
	
}