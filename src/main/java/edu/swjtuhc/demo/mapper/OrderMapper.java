package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Order;

@Mapper
public interface OrderMapper {
	
	public int inserOrder(Order order);

	public Order selectOrderByOrdername(String getoName);

	public int delOrder(Order order);

	public List<Order> queryOrderList();

	public List<Order> selectAllOrderList();
	
	
}
