package com.test.sp11;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class test {
	
	@Test
	public void test1() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		ds.setUsername("jtest");
		ds.setPassword("ezen1234");
		assertNotNull(ds);
		
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//assertNotNull(con);
	}

}
