package com.cdac.Mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cdac.dto.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		
	
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setRoll_id(rs.getInt("roll_id"));
		
		
		return user;
	}
	
	

}