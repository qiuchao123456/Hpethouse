package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GoodstypeMapper;
import edu.swjtuhc.demo.model.Goodstype;
import edu.swjtuhc.demo.service.GoodstypeService;

@Service
public class GoodstypeServiceImpl implements GoodstypeService{
	
	@Autowired
	GoodstypeMapper goodstypeMapper;//注入goodstypeService对象

	@Override
	public int addgdtype(Goodstype goodstype) {
		// TODO Auto-generated method stub
		//调用mapper添加
		Goodstype u0 = goodstypeMapper.selectGoodstypeByname(goodstype.gettName());
		int i=-1;
		if(u0==null) {
			i=goodstypeMapper.insergoodstype(goodstype);
		}else {
			i = 2;
		}
		
		return i;
	}

	@Override
	public List<Goodstype> getGoodsList() {
		// TODO Auto-generated method stub
		//调用mapper层实现获取列表
		return goodstypeMapper.selectAllGoodstypeList();
	}

	@Override
	public int delgdtype(Goodstype goodstype) {
		// TODO Auto-generated method stub
		//调用mapper层实现删除商品
		Goodstype g0 = goodstypeMapper.selectGoodstypeByname(goodstype.gettName());
		int i= -1;
		if(g0!=null) {
			i=goodstypeMapper.delgdtype(goodstype);
		}else {
			i=2;
		}
		return i;
	}
	
	
}
