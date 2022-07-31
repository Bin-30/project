package cn.tedu.csmall.product.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 相册
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AlbumAddNewDTO implements Serializable {

    /**
     * 相册名称
     */
    @NotNull(message = "添加相册失败,必须提交相册名称")
    private String name;

    /**
     * 相册简介
     */
    @NotNull(message = "添加相册失败,必须提交相册简介")
    private String description;

    /**
     * 自定义排序序号
     */
    @NotNull(message = "添加相册失败,必须提交相册分类序号")

    private Integer sort;

}