package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.BrandCategoryMapper;
import cn.tedu.csmall.product.pojo.dto.BrandCategoryAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.BrandCategory;
import cn.tedu.csmall.product.service.BrandCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class BrandCategoryServiceImpl implements BrandCategoryService {
    @Autowired
    BrandCategoryMapper brandCategoryMapper;

    @Override
    public void addNew(BrandCategoryAddNewDTO brandCategoryAddNewDTO) {
        int countById = brandCategoryMapper.countById(brandCategoryAddNewDTO.getBrandId(),brandCategoryAddNewDTO.getCategoryId());
        if (countById>0){
            log.warn("重复了不能添加");
            throw new ServiceException("重复了不能添加");
        }
        BrandCategory brandCategory = new BrandCategory();
        BeanUtils.copyProperties(brandCategoryAddNewDTO,brandCategory);
        brandCategory.setGmtCreate(LocalDateTime.now());
        brandCategory.setGmtModified(LocalDateTime.now());
        log.debug("输入的两个ID：{},{}",brandCategoryAddNewDTO.getBrandId(),brandCategoryAddNewDTO.getCategoryId());
        brandCategoryMapper.insert(brandCategory);
        log.debug("添加成功");
    }

    @Override
    public void deleteById(Long id) {
        int countId = brandCategoryMapper.countId(id);
        log.debug("id:{}",id);
        if (countId<=0){
            log.warn("不存在");
            throw new ServiceException("不存在");
        }
        brandCategoryMapper.deleteById(id);
        log.debug("删除成功");

    }
}
