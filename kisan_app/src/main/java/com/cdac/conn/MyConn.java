package com.cdac.conn;

import org.springframework.jdbc.core.JdbcTemplate;

public class MyConn {
	private static JdbcTemplate jdbcTemplate;

	
	
	public MyConn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
