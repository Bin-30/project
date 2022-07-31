package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureMapper {
    int insert(Picture picture);
    int deleteById(Long id);
    int countByUrl(String url);
    int countById(Long id);
}
