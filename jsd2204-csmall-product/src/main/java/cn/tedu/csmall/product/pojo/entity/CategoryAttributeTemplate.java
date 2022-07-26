package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 类别与属性模版关联(PmsCategoryAttributeTemplate)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:13:21
 */
public class CategoryAttributeTemplate implements Serializable {
    private static final long serialVersionUID = 377083231898850261L;

    public CategoryAttributeTemplate() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * 类别id
     */
    private Integer categoryId;
    /**
     * 属性模版id
     */
    private Integer attributeTemplateId;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAttributeTemplateId() {
        return attributeTemplateId;
    }

    public void setAttributeTemplateId(Integer attributeTemplateId) {
        this.attributeTemplateId = attributeTemplateId;
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

