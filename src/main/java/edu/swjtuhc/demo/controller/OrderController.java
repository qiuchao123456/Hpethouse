package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.Order;
import edu.swjtuhc.demo.service.OrderService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;//注入orderService对象
	
	
	//添加订单
		@RequestMapping("/addOrder")
		public JSONObject addOrder(@RequestBody Order order) {
			JSONObject result = new JSONObject();
			
			//调用Service层
			int i=orderService.addOrder(order);
			result.put("state",i);
			return result;
		}
		//删除订单
		@RequestMapping("/delOrder")
		public JSONObject delGoods(@RequestBody Order order) {
			JSONObject result = new JSONObject();
			
			//调用Service层
			int i = orderService.delOrder(order);
			result.put("state", i);
			return result;
		}
		//获取订单列表
		@RequestMapping("/getOrderList")
		public List<Order> getOrderList(){
			
			//调用Service
			return orderService.getOrderList();
		}
}
