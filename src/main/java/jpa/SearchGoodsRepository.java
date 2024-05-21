package jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SearchGoodsRepository extends JpaRepository<SearchGoodsEntity, Long> {

    @Query("SELECT g.brand_nm, g.cate_nm, MIN(g.price) as minPrice FROM SearchGoodsEntity g GROUP BY g.brand_nm, g.cate_nm")
    List<SearchGoodsEntity> getSearchByAll();
}