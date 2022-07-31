package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.BrandMapper;
import cn.tedu.csmall.product.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.service.IBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    BrandMapper brandMapper;
    @Override
    public void addNew(BrandAddNewDTO brandAddNewDTO) {
        int countByName = brandMapper.countByName(brandAddNewDTO.getName());
        log.debug("此名称的数量：{}",countByName);
        if (countByName>0){
            log.warn("错误");
            throw new ServiceException("名字已存在");
        }
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandAddNewDTO,brand);
        brand.setGmtCreate(LocalDateTime.now());
        brand.setGmtModified(LocalDateTime.now());
        log.debug("插入的对象：{}",brand);
        int i = brandMapper.insert(brand);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("添加成功");
    }

    @Override
    public void deleteById(Long id) {
        int countById = brandMapper.countById(id);
        if (countById<=0){
            log.warn("品牌不存在");
            throw new ServiceException("品牌不存在");
        }
        log.debug("id:{}",id);
        int i = brandMapper.deleteById(id);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("删除成功");
    }
}
