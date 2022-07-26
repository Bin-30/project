package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌与类别关联(PmsBrandCategory)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:05:59
 */
public class BrandCategory implements Serializable {
    private static final long serialVersionUID = -67069206968020523L;

    public BrandCategory() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * 品牌id
     */
    private Integer brandId;
    /**
     * 类别id
     */
    private Integer categoryId;
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

