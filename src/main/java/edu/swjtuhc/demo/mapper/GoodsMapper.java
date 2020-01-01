package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Goods;

@Mapper
public interface GoodsMapper {
	
   public Goods selectGoodsBygdName(String gdName);
   
   public List<Goods> selectAllGoodsList();
   
   public Goods queryGoodsBygdName(String gdName);
   
   public List<Goods> queryGoodsList();
   
   public int insertGoods(Goods goods);

   public int delGoods(Goods goods);
   
   public int alterGoods(Goods goods);
   
}
