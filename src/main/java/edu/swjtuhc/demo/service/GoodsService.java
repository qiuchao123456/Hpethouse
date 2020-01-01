package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Goods;

public interface GoodsService {
      public List<Goods> getGoodsList();
      public int instertGoods(Goods goods);
      public int delGoods(Goods goods);
      public int alterGoods(Goods goods);
      public List<Goods> queryGoods();
      
}
