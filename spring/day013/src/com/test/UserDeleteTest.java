package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
		
		
		String k = "id01";
		UserVO u = new UserVO("id01","pwd01", "lee");
		service.register(u);
		service.remove(k);

	}

}
