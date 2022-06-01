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
		
		
		String k = "0";
		try {
			service.remove(k);
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
//			e.printStackTrace();
		}

	}

}
