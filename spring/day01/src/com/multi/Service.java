package com.multi;

public class Service {
	Dao dao;
	
	public Service() {
		dao = new Dao();
		
	}
	public void register(UserVO user) {
		// Security, 
		dao.insert(user);
	}
}
