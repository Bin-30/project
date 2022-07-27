package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.pojo.vo.BrandListItemVo;
import cn.tedu.csmall.product.pojo.vo.BrandStandardVo;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    int insertBatch(List<Brand> brands);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int update(Brand brand);

    BrandStandardVo getStandardById(Long id);

    List<BrandListItemVo> list();

    int count();


}
