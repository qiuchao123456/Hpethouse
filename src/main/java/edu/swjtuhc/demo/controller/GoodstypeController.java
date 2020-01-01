package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.Goodstype;
import edu.swjtuhc.demo.service.GoodstypeService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/goodstype")
public class GoodstypeController {

	@Autowired
	GoodstypeService goodstypeService;//注入goodstypeService对象
	
	//添加商品类型
	@RequestMapping("/addgdtype")
	public JSONObject addgdtype(@RequestBody Goodstype goodstype) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i=goodstypeService.addgdtype(goodstype);
		result.put("state", i);
		return result;
	}
	
	//获取商品类型列表
	@RequestMapping("/getList")
	public List<Goodstype> getList(){
		//调用Service层
		return goodstypeService.getGoodsList();
	}
	
	//删除商品类别
	@RequestMapping("/delgdtype")
	public JSONObject delgdtype(@RequestBody Goodstype goodstype) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = goodstypeService.delgdtype(goodstype);
		result.put("state", i);
		return result;
	}
}
