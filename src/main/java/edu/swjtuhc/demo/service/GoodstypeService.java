package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Goodstype;
public interface GoodstypeService {
	public int addgdtype(Goodstype goodstype);
	public List<Goodstype> getGoodsList();
	public int delgdtype(Goodstype goodstype);
}
