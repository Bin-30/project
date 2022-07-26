package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)//链式打点: new Album().setId(1L).setDescription();
//@Setter,@Getter,@EqualsAndHashCode,@ToString
//@NoArgsConstructor,@AllArgsConstructor
public class Album implements Serializable {
    private static final long serialVersionUID = 42L;
    private Long id;
    private String  name;
    private String description;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;


}
