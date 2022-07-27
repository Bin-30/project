package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import org.springframework.stereotype.Repository;

/**
 * 品牌数据的mapper接口
 * @author Bin
 * @version 0.0.1
 */
@Repository
public interface BrandMapper {
    /**
     * 插入品牌数据
     * @param brand 品牌数据
     * @return 受影响的行数
     */
    int insert(Brand brand);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int update(Brand brand);
}
