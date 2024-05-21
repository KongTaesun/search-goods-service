package controller;

import jpa.SearchGoodsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SearchGoodsService;
import vo.ResponseSearchGoods;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search-goods-service")
public class SearchGoodsController {

    private Environment env;
    SearchGoodsService searchService;

    @Autowired
    public SearchGoodsController(Environment env, SearchGoodsService searchService) {
        this.env = env;
        this.searchService = searchService;
    }

    @GetMapping("/SearchGoods")
    public ResponseEntity<List<ResponseSearchGoods>> cateLowBrandPriceTotal() {

        Iterable<SearchGoodsEntity> searchList = searchService.getSearchByAll();

        List<ResponseSearchGoods> result = new ArrayList<>();
        searchList.forEach(v -> {
            result.add(new ModelMapper().map(v, ResponseSearchGoods.class));
        });

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}