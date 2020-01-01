package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GoodsMapper;
import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsMapper goodsMapper;//注入goodsService对象

	@Override
	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		//调用mapper实现查询语句
		
		return goodsMapper.selectAllGoodsList();
	}

	@Override
	public int instertGoods(Goods goods) {
		// TODO Auto-generated method stub
		//调用mapper层实现添加商品
		Goods g0 = goodsMapper.selectGoodsBygdName(goods.getGdName());
		int i = -1;
		if(g0==null) {
			i=goodsMapper.insertGoods(goods);
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public int delGoods(Goods goods) {
		// TODO Auto-generated method stub
		//调用mapper层实现删除商品
		Goods g0=goodsMapper.selectGoodsBygdName(goods.getGdName());
		int i = -1;
		if(g0!=null) {
			i=goodsMapper.delGoods(goods);
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public int alterGoods(Goods goods) {
		// TODO Auto-generated method stub
		//调用mapper层实现修改商品
		Goods g0 = goodsMapper.selectGoodsBygdName(goods.getGdName());
		int i = -1 ;
		if(g0!=null) {
			i=goodsMapper.alterGoods(goods);
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public List<Goods> queryGoods() {
		// TODO Auto-generated method stub
		//通过名字查询商品信息
		return goodsMapper.queryGoodsList();
	}
}
