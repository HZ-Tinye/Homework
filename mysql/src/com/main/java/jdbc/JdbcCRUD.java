package com.main.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;

import com.main.java.util.JdbcUtil;

public class JdbcCRUD {
	
	@Test
	public void add() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into users(name,password,email,birthday) values ('gfy','123456','gfy@itcast.cn','2013-04-30')");
			Assert.assertEquals(1, i);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.release(rs, stmt, conn);
		}
	}
	@Test
	public void update() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			int i = stmt.executeUpdate("update users set password='123' where name='gfy'");
			Assert.assertEquals(1, i);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.release(rs, stmt, conn);
		}
	}
	@Test
	public void queryOne() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from users where name='gfy'");
			if(rs.next()){
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.release(rs, stmt, conn);
		}
	}
	@Test
	public void queryAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from users");
			while(rs.next()){
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.release(rs, stmt, conn);
		}
	}
	@Test
	public void delete() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.createStatement();
			int i = stmt.executeUpdate("delete from users where name='gfy'");
			Assert.assertEquals(1, i);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.release(rs, stmt, conn);
		}
	}
}
