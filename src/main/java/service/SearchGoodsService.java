package service;

import jpa.SearchGoodsEntity;


public interface SearchGoodsService {

    Iterable<SearchGoodsEntity> getSearchByAll();
}
