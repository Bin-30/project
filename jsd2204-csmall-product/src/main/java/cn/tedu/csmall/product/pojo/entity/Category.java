package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 类别(PmsCategory)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:10:38
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 262333890776020254L;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", depth=" + depth +
                ", keywords='" + keywords + '\'' +
                ", sort=" + sort +
                ", icon='" + icon + '\'' +
                ", enable=" + enable +
                ", isParent=" + isParent +
                ", isDisplay=" + isDisplay +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    /**
     * 记录id
     */



    private Integer id;
    /**
     * 类别名称
     */
    private String name;
    /**
     * 父级类别id，如果无父级，则为0
     */
    private Integer parentId;
    /**
     * 深度，最顶级类别的深度为1，次级为2，以此类推
     */
    private Integer depth;
    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    private String keywords;
    /**
     * 自定义排序序号
     */
    private Integer sort;
    /**
     * 图标图片的URL
     */
    private String icon;
    /**
     * 是否启用，1=启用，0=未启用
     */
    private Integer enable;
    /**
     * 是否为父级（是否包含子级），1=是父级，0=不是父级
     */
    private Integer isParent;
    /**
     * 是否显示在导航栏中，1=启用，0=未启用
     */
    private Integer isDisplay;
    /**
     * 数据创建时间
     */
    private Date gmtCreate;
    /**
     * 数据最后修改时间
     */
    private Date gmtModified;


    public Category() {
        super();
    }

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
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

