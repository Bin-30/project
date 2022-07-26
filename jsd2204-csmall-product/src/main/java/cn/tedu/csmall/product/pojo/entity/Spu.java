package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * SPU（Standard Product Unit）(PmsSpu)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:16:49
 */
public class Spu implements Serializable {
    private static final long serialVersionUID = -27721270037564117L;

    public Spu() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * SPU名称
     */
    private String name;
    /**
     * SPU编号
     */
    private String typeNumber;
    /**
     * 标题
     */
    private String title;
    /**
     * 简介
     */
    private String description;
    /**
     * 价格（显示在列表中）
     */
    private Double listPrice;
    /**
     * 当前库存（冗余）
     */
    private Integer stock;
    /**
     * 库存预警阈值（冗余）
     */
    private Integer stockThreshold;
    /**
     * 计件单位
     */
    private String unit;
    /**
     * 品牌id
     */
    private Integer brandId;
    /**
     * 品牌名称（冗余）
     */
    private String brandName;
    /**
     * 类别id
     */
    private Integer categoryId;
    /**
     * 类别名称（冗余）
     */
    private String categoryName;
    /**
     * 属性模版id
     */
    private Integer attributeTemplateId;
    /**
     * 相册id
     */
    private Integer albumId;
    /**
     * 组图URLs，使用JSON数组表示
     */
    private String pictures;
    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    private String keywords;
    /**
     * 标签列表，各标签使用英文的逗号分隔，原则上最多3个
     */
    private String tags;
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
     * 是否标记为删除，1=已删除，0=未删除
     */
    private Integer isDeleted;
    /**
     * 是否上架（发布），1=已上架，0=未上架（下架）
     */
    private Integer isPublished;
    /**
     * 是否新品，1=新品，0=非新品
     */
    private Integer isNewArrival;
    /**
     * 是否推荐，1=推荐，0=不推荐
     */
    private Integer isRecommend;
    /**
     * 是否已审核，1=已审核，0=未审核
     */
    private Integer isChecked;
    /**
     * 审核人（冗余）
     */
    private String checkUser;
    /**
     * 审核通过时间（冗余）
     */
    private Date gmtCheck;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Integer attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    public Integer getIsNewArrival() {
        return isNewArrival;
    }

    public void setIsNewArrival(Integer isNewArrival) {
        this.isNewArrival = isNewArrival;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    public Date getGmtCheck() {
        return gmtCheck;
    }

    public void setGmtCheck(Date gmtCheck) {
        this.gmtCheck = gmtCheck;
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

