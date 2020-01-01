package edu.swjtuhc.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.GoodsService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/goods")
public class GoodsController {
     @Autowired
     GoodsService goodsService;//注入goodsService对象
	
	
     //获取商品列表
	@RequestMapping("/getGoodsList")
		public List<Goods> getGoodsList(){
		
		//调用Service层
		return goodsService.getGoodsList();
	}
	//添加商品
	@RequestMapping("/insertGoods")
		public JSONObject insertGoods(@RequestBody Goods goods) {
			JSONObject result = new JSONObject();
		
			//调用Service层
			int i=goodsService.instertGoods(goods);
			result.put("state", i);
			return result;
	}
	//删除商品
	@RequestMapping("/delGoods")
	public JSONObject delGoods(@RequestBody Goods goods) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = goodsService.delGoods(goods);
		result.put("state", i);
		return result;
	}
	//修改商品信息
	@RequestMapping("/alterGoods")
	public JSONObject alterGoods(@RequestBody Goods goods) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i= goodsService.alterGoods(goods);
		result.put("state", i);
		return result;
	}
	//查询商品信息
	@RequestMapping("/queryGoods")
	public List<Goods> queryGoods(@RequestBody Goods goods){
		
		//调用service层
		return goodsService.queryGoods();
	}
}
