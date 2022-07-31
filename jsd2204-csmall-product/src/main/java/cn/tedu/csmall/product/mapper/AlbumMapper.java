package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVo;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    int insertBatch(List<Album> albums);

    int deleteById(Long id);

    int deleteByIds(Long ...id);

    int update(Album album);

    int count();

    AlbumStandardVo getStandardById(Long id);

    int countByName(String name);

    int countById(Long id);


}
