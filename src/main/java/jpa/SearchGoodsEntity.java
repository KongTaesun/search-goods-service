package jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class SearchGoodsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true)
    private String cate_nm;
    @Column(nullable = false, length = 120, unique = true)
    private String brand_nm;
    @Column(nullable = false)
    private Integer price;

}
