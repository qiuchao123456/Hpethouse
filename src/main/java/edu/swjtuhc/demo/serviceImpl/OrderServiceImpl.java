package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.OrderMapper;
import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.Order;
import edu.swjtuhc.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderMapper orderMapper;//注入orderMapper对象

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		//调用mapper层实现添加
		Order o0=orderMapper.selectOrderByOrdername(order.getoName());
		int i=-1;
		if(o0==null) {
			i=orderMapper.inserOrder(order);
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public int delOrder(Order order) {
		// TODO Auto-generated method stub
		//调用mapper层实现删除商品
				Order g0=orderMapper.selectOrderByOrdername(order.getoName());
				int i = -1;
				if(g0!=null) {
					i=orderMapper.delOrder(order);
				}else {
					i=2;
				}
				return i;
	}

	@Override
	public List<Order> getOrderList() {
		// TODO Auto-generated method stub
		return orderMapper.selectAllOrderList();
	}
	
}
