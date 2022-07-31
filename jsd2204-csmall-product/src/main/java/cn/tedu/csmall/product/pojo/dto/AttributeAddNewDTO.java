package cn.tedu.csmall.product.pojo.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class AttributeAddNewDTO implements Serializable {
    private Long templateId;
    private String name;
    private String description;
    private Integer type;
    private Integer inputType;
    private String valueList;
    private String unit;
    private Integer sort;
    private Integer isAllowCustomize;
}