package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class SelectTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		
		CustVO cust = null;
		
		try {
			cust = biz.get("id01");
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
