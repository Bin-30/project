package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.CategoryMapper;
import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Category;
import cn.tedu.csmall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public void addNew(CategoryAddNewDTO categoryAddNewDTO) {
        int countByName = categoryMapper.countByName(categoryAddNewDTO.getName());
        if (countByName>0){
            log.warn("类别已存在");
            throw new ServiceException("类别已存在");
        }
        Category category = new Category();
        BeanUtils.copyProperties(categoryAddNewDTO,category);
        category.setGmtCreate(LocalDateTime.now());
        category.setGmtModified(LocalDateTime.now());
        log.debug("插入的对象：{}",category);
        int i = categoryMapper.insert(category);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("插入成功");
    }

    @Override
    public void deleteById(Long id) {
        int i = categoryMapper.countById(id);
        if (i<=0){
            log.warn("不存在");
            throw new ServiceException("不存在");
        }
        log.debug("删除的ID：{}",id);
        categoryMapper.deleteById(id);
        log.debug("删除成功");
    }
}
