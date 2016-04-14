package com.main.java.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.main.java.util.JdbcUtil;

//create database users(
//		id int(11) primary key auto_increment,
//		name varchar(40),
//		password varchar(40),
//		email varchar(60),
//		birthday date
//		);
//insert into users(id,name,password,email,birthday) values (1,'zs','123456','zs@sina.com','1980-12-04');
//insert into users(id,name,password,email,birthday) values (2,'lisi','123456','lisi@sina.com','1981-12-04');
//insert into users(id,name,password,email,birthday) values (3,'wangwu','123456','wangwu@sina.com','1979-12-04');

public class Jdbc {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String sql = "create table wusers(id int(11) );";
//"insert into wusers(id,name,password,email,birthday) values (1,'zs','123456','zs@sina.com','1980-12-04');"+
//"insert into wusers(id,name,password,email,birthday) values (2,'lisi','123456','lisi@sina.com','1981-12-04');"+
//"insert into wusers(id,name,password,email,birthday) values (3,'wangwu','123456','wangwu@sina.com','1979-12-04');";
	@Test
	public void create() {
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
//			while(rs.next()){
//				System.out.println(rs.getString("id"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("password"));
//				System.out.println(rs.getString("email"));
//				System.out.println(rs.getString("birthday"));
//			}
		} catch (Exception e) {
			e.printStackTrace();;
		} finally {
			JdbcUtil.release(rs, stmt, conn);
		}
		
	
	}
	
	
}
