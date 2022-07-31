package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.PictureMapper;
import cn.tedu.csmall.product.pojo.dto.PictureAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Picture;
import cn.tedu.csmall.product.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    PictureMapper pictureMapper;

    @Override
    public void addNew(PictureAddNewDTO pictureAddNewDTO) {
        int countByUrl = pictureMapper.countByUrl(pictureAddNewDTO.getUrl());
        if (countByUrl>0){
            log.warn("添加失败，URL重复");
            throw new ServiceException("添加失败，URL重复");
        }
        Picture picture = new Picture();
        BeanUtils.copyProperties(pictureAddNewDTO,picture);
        picture.setGmtCreate(LocalDateTime.now());
        picture.setGmtModified(LocalDateTime.now());
        log.debug("添加的相册对象{}",pictureAddNewDTO);
        int i = pictureMapper.insert(picture);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("添加成功");
    }

    @Override
    public void deleteById(Long id) {
        int countById = pictureMapper.countById(id);
        if (countById<=0){
            log.warn("不存在");
            throw new ServiceException("不存在");
        }
        log.debug("id:{}",id);
        int i = pictureMapper.deleteById(id);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("删除成功");
    }
}
