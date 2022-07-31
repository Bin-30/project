package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * SKU（Stock Keeping Unit）(PmsSku)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:15:29
 */
@Data
public class Sku implements Serializable {
    private static final long serialVersionUID = -14340884103080671L;

    public Sku() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * SPU id
     */
    private Integer spuId;
    /**
     * 标题
     */
    private String title;
    /**
     * 条型码
     */
    private String barCode;
    /**
     * 属性模版id
     */
    private Integer attributeTemplateId;
    /**
     * 全部属性，使用JSON格式表示（冗余）
     */
    private String specifications;
    /**
     * 相册id
     */
    private Integer albumId;
    /**
     * 组图URLs，使用JSON格式表示
     */
    private String pictures;
    /**
     * 单价
     */
    private Double price;
    /**
     * 当前库存
     */
    private Integer stock;
    /**
     * 库存预警阈值
     */
    private Integer stockThreshold;
    /**
     * 销量（冗余）
     */
    private Integer sales;
    /**
     * 买家评论数量总和（冗余）
     */
    private Integer commentCount;
    /**
     * 买家好评数量总和（冗余）
     */
    private Integer positiveCommentCount;
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

