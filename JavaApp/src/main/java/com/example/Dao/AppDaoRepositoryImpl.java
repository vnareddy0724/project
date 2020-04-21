package com.example.Dao;



import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Cart;

@Repository
public class AppDaoRepositoryImpl implements AppDaoRepository {

	@Autowired
	JdbcTemplate JdbcTemplate;
	@Autowired
	DataSource datasource;
	
	@Override
	public boolean addUser(String parameter, String parameter2) {
		// TODO Auto-generated method stub
		String username = null;
		String sql="INSERT INTO USER VALUES(?,?)";
		
		String selectSql="Select username from user where username =?";
		try {
			username = JdbcTemplate.queryForObject(selectSql, new Object[] {parameter},String.class);
		}
		catch(Exception e) {
			
		}
		if(username == null) {
		JdbcTemplate.update(sql,new Object[] {parameter,parameter2});
		return true;
		}
		return false;
	}

	@Override
	public boolean validateUser(String parameter, String parameter2) {
		// TODO Auto-generated method stub
		
		String username=null;
		String selectSql="Select username from user where username =? and password = ?";
		try {
			username = JdbcTemplate.queryForObject(selectSql, new Object[] {parameter,parameter2},String.class);
		}
		catch(Exception e) {
			
		}
		
		if(username == null) {
			return false;
		}
		
		return true;
	}

	@Override
	public void storeBookings(Object attribute, Object attribute2, Object attribute3) {
		// TODO Auto-generated method stub
		
		String sql = "insert into bookings values(?,?,?)";
		
		try {
			JdbcTemplate.update(sql,new Object[] {attribute,attribute2,attribute3});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<String> getCart(Object attribute) {
		// TODO Auto-generated method stub
		
		String sql="Select hotel from bookings where username=?";
		List<String> result=new ArrayList<>();
		try {
			result=JdbcTemplate.queryForList(sql,new Object[] {attribute},String.class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
