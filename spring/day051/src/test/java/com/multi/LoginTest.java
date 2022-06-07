package com.multi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class LoginTest {

	@Autowired
	CustBiz cbiz;
	
	@Test
	void contextLoads() {
		CustVO cust;
		try {
			cust = cbiz.get("id34");
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
