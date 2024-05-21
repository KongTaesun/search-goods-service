package service;

import jpa.SearchGoodsEntity;
import jpa.SearchGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchGoodsServiceImpl implements SearchGoodsService {
    SearchGoodsRepository searchRepository;
    Environment env;
    RestTemplate restTemplate;

    @Autowired
    public SearchGoodsServiceImpl(SearchGoodsRepository searchRepository,
                                  Environment env,
                                  RestTemplate restTemplate) {
        this.searchRepository = searchRepository;
        this.env = env;
        this.restTemplate = restTemplate;
    }

    @Override
    public Iterable<SearchGoodsEntity> getSearchByAll(){
        return searchRepository.findAll();
    }
}
