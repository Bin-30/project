package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * SKU数据(PmsSkuSpecification)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:16:15
 */
@Data
public class SkuSpecification implements Serializable {
    private static final long serialVersionUID = -97213577953246872L;

    public SkuSpecification() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * SKU id
     */
    private Integer skuId;
    /**
     * 属性id
     */
    private Integer attributeId;
    /**
     * 属性名称
     */
    private String attributeName;
    /**
     * 属性值
     */
    private String attributeValue;
    /**
     * 自动补充的计量单位
     */
    private String unit;
    /**
     * 自定义排序序号
     */
    private Integer sort;
    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreate;
    /**
     * 数据最后修改时间
     */
    private  LocalDateTime gmtModified;



}

