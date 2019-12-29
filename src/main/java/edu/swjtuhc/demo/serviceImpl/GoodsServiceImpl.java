package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GoodsMapper;
import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsMapper goodsMapper;
	
	@Override
	public int register(Goods goods) {
		// TODO Auto-generated method stub
		//调用mapper实现查询
		Goods g0 =  goodsMapper.selectGoodsBygdName(goods.getGdName());
		int i = -1;
		if (g0==null) {
			i = goodsMapper.insertGoods(goods);
		}else {
			i = 2;
		}
		return i;
	}

}
