package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Goodstype;

@Mapper
public interface GoodstypeMapper {

	public Goodstype selectGoodstypeByname(String gettName);

	public int insergoodstype(Goodstype goodstype);

	public List<Goodstype> selectAllGoodstypeList();

	public int delgdtype(Goodstype goodstype);
	
}
