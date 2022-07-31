package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Category;
import cn.tedu.csmall.product.pojo.vo.CategoryStandardVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类数据的mapper接口
 * @author Bin
 * @version 0.0.1
 */
@Repository
public interface CategoryMapper {

    /**
     * 插入分类数据
     * @param category 分类数据
     * @return 受影响的行数
     */
    int insert(Category category);

    int deleteById(Long id);

    int deleteByIds(List<Long> ids);

    int update(Category category);

    int count();

    int countByName(String name);

    int countById(Long id);

    CategoryStandardVo getStandardById(Long id);

}
