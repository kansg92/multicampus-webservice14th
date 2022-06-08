package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ProductMapper;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@Service
public class ProductBiz implements Biz<Integer, ProductVO> {

	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
		
	}
	
	public List<ProductVO> get2() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll2();
		
	}
	
	public List<ProductAVGVO> getCateAvg() throws Exception {
		// TODO Auto-generated method stub
		return dao.cateavg();
		
	}
	
	public int selectcnt() throws Exception{
		return dao.selectcnt();
	}
	

}
