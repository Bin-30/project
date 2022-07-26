package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * SKU（Stock Keeping Unit）(PmsSku)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:15:29
 */
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
    private Date gmtCreate;
    /**
     * 数据最后修改时间
     */
    private Date gmtModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Integer attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockThreshold() {
        return stockThreshold;
    }

    public void setStockThreshold(Integer stockThreshold) {
        this.stockThreshold = stockThreshold;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPositiveCommentCount() {
        return positiveCommentCount;
    }

    public void setPositiveCommentCount(Integer positiveCommentCount) {
        this.positiveCommentCount = positiveCommentCount;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}

