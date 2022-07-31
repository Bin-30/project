package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.pojo.dto.PictureAddNewDTO;

public interface PictureService {
    void addNew(PictureAddNewDTO pictureAddNewDTO);
    void deleteById(Long id);
}
