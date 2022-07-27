package cn.tedu.csmall.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BrandListItemVo implements Serializable {
    private Long id;
    private String name;
    private String logo;

}

