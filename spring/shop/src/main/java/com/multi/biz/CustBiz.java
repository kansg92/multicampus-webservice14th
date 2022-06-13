package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CustMapper;
import com.multi.vo.CustVO;

@Service
public class CustBiz implements Biz<String, CustVO> {

	@Autowired
	CustMapper dao;
	
	@Override
	public void register(CustVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void modify(CustVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public CustVO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<CustVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
				
	}

}