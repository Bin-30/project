package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片(PmsPicture)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:14:55
 */
public class Picture implements Serializable {
    private static final long serialVersionUID = 134673331712254393L;

    public Picture() {
        super();
    }

    /**
     * 记录id
     */

    private Integer id;
    /**
     * 相册id
     */
    private Integer albumId;
    /**
     * 图片url
     */
    private String url;
    /**
     * 图片简介
     */
    private String description;
    /**
     * 图片宽度，单位：px
     */
    private Integer width;
    /**
     * 图片高度，单位：px
     */
    private Integer height;
    /**
     * 是否为封面图片，1=是，0=否
     */
    private Integer isCover;
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

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIsCover() {
        return isCover;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
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

