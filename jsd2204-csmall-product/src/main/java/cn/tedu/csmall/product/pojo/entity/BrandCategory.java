package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 品牌与类别关联(PmsBrandCategory)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:05:59
 */
@Data
public class BrandCategory implements Serializable {
    private static final long serialVersionUID = -67069206968020523L;

    public BrandCategory() {
        super();
    }

    /**
     * 记录id
     */

    private Long id;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 类别id
     */
    private Long categoryId;
    /**
     * 数据创建时间
     */
    private  LocalDateTime gmtCreate;
    /**
     * 数据最后修改时间
     */
    private LocalDateTime gmtModified;


}

