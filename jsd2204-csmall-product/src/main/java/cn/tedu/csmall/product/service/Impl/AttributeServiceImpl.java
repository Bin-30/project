package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AttributeMapper;
import cn.tedu.csmall.product.pojo.dto.AttributeAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Attribute;
import cn.tedu.csmall.product.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    AttributeMapper attributeMapper;

    @Override
    public void addNew(AttributeAddNewDTO attributeAddNewDTO) {
        int countByName = attributeMapper.countByName(attributeAddNewDTO.getName());
        if (countByName>0){
            log.warn("已存在");
            throw new ServiceException("已存在,不能重复插入");
        }
        Attribute attribute = new Attribute();
        BeanUtils.copyProperties(attributeAddNewDTO,attribute);
        attribute.setGmtCreate(LocalDateTime.now());
        attribute.setGmtModified(LocalDateTime.now());
        log.debug("插入的对象:{}",attribute);
        int i = attributeMapper.insert(attribute);
        if (i!=1){
            log.debug("服务器繁忙");
            throw new ServiceException("服务器繁忙");
        }
        log.debug("插入成功");
    }

    @Override
    public void deleteById(Long id) {
        int countById = attributeMapper.countById(id);
        if (countById==0){
            log.warn("不存在");
            throw new ServiceException("无法删除");
        }
        log.debug("id:{}",id);
        attributeMapper.deleteById(id);
        log.debug("删除成功");
    }
}
