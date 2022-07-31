package cn.tedu.csmall.product.service.Impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AlbumMapper;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService {
    @Autowired
    private AlbumMapper albumMapper;

    public AlbumServiceImpl() {
        log.debug("AlbumServiceImpl");
    }

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
        log.debug("开始处理:{}",albumAddNewDTO);
        int count = albumMapper.countByName(albumAddNewDTO.getName());
        log.debug("数量{}",count);
        if (count!=0){
            log.warn("已存在");
            throw new ServiceException("相册名称"+albumAddNewDTO.getName()+"已存在");
        }
        Album album = new Album();
//        album.setName(albumAddNewDTO.getName());
//        album.setSort(albumAddNewDTO.getSort());
//        album.setDescription(albumAddNewDTO.getDescription());
        BeanUtils.copyProperties(albumAddNewDTO,album);
        album.setGmtCreate(LocalDateTime.now());
        album.setGmtModified(LocalDateTime.now());
        log.debug("album:{}",album);
        int i = albumMapper.insert(album);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("插入成功");
    }

    @Override
    public void deleteByID(Long id) {
        int countById = albumMapper.countById(id);
        if (countById<=0){
            log.debug("不存在该相册");
            throw new ServiceException("不存在该相册");
        }
        log.debug("id:{}",id);
        int i = albumMapper.deleteById(id);
        if (i!=1){
            log.warn("服务器繁忙稍后再试");
            throw new ServiceException("服务器繁忙稍后再试");
        }
        log.debug("删除成功");
    }
}
