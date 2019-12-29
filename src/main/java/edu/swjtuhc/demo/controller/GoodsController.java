package edu.swjtuhc.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.GoodsService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/controller")
public class GoodsController {
     @Autowired
     GoodsService goodsService;
	
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody Goods goods) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = goodsService.register(goods);
		result.put("state", i);
		return result;
	}
}
