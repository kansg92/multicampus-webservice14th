package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ItemMapper;
import com.vo.ItemVO;

@org.springframework.stereotype.Service("itemService")
public class ItemService implements Service<Integer, ItemVO> {

	@Autowired
	ItemMapper dao;
	
	@Override
	public void register(ItemVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public void modify(ItemVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
	}	

	@Override
	public ItemVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<ItemVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	public List<ItemVO> searchName(String name) throws Exception{
		
		return dao.searchName(name);
	}
	
	public List<ItemVO> searchPrice(Map<String,Integer> map) throws Exception{
		return dao.searchPrice(map);
	}
	
	public List<ItemVO> searchDate(String date) throws Exception{
		return dao.searchDate(date);
	}

}
