package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * SPU详情(PmsSpuDetail)实体类
 *
 * @author makejava
 * @since 2022-07-25 19:18:49
 */
@Data
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
    private LocalDateTime gmtCreate;
    /**
     * 数据最后修改时间
     */
    private  LocalDateTime gmtModified;



}

