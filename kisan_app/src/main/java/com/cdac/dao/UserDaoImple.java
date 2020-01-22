package com.cdac.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cdac.Mapper.UserRowMapper;
import com.cdac.conn.MyConn;
import com.cdac.dto.User;

@Component
public class UserDaoImple implements UserDao {
	
	MyConn obj = new MyConn();
	
	public boolean create(User user) {
		
		try {
		String sql = "INSERT INTO USER(username,password,Cpassword,email,mobile,city,roll_id) VALUES (?,?,?,?,?,?,?)";
		
		obj.getJdbcTemplate().update(sql, new Object[] {user.getUsername(),user.getPassword(),user.getCpassword(),user.getEmail(),user.getMobile(),user.getCity(),user.getRoll_id()} );
		}catch(Exception e) {
			System.out.println(e.getMessage()+"");
		}
		
		return true;
	}
	
	
	public User validateUser(User user) {
		System.out.println(user.getUsername());
		String sql = "SELECT * FROM user WHERE username=? AND password=?";
		User dbuser = obj.getJdbcTemplate().queryForObject(sql, new Object[] {user.getUsername(), user.getPassword()}, new UserRowMapper());
		
		if(dbuser == null) {
			return null;
		}
		return dbuser;
		
	}


	public User select(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}