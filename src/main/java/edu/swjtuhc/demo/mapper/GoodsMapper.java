package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Goods;

@Mapper
public interface GoodsMapper {
	
   public Goods selectGoodsBygdName(String gdName);
   
   public int insertGoods(Goods goods);

}
