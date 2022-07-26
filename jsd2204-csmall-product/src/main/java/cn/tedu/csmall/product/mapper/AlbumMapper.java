package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.springframework.stereotype.Repository;

/**
 * 相册数据的mapper接口
 * @author Bin
 * @version 0.0.1
 */
@Repository
public interface AlbumMapper {

    /**
     * 插入相册数据
     * @param album 相册数据
     * @return 受影响的行数
     */
    int insert(Album album);


    int deleteById(Long id);
}
