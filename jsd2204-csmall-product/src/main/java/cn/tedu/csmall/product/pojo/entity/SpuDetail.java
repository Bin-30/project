package cn.tedu.csmall.product.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * SPU详情(PmsSpuDetail)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:18:49
 */
public class SpuDetail implements Serializable {
    private static final long serialVersionUID = -79209110589678554L;

    public SpuDetail() {
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
     * SPU详情，应该使用HTML富文本，通常内容是若干张图片
     */
    private String detail;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

