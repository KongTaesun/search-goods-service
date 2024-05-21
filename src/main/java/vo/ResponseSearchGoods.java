package vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseSearchGoods {

    private String cate_nm;
    private String brand_nm;
    private String price;

}
