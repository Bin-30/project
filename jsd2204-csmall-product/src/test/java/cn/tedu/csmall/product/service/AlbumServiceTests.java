package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlbumServiceTests {
    @Autowired
    IAlbumService iAlbumService;

    @Test
    public void testAdd(){
        AlbumAddNewDTO albumAddNewDTO = new AlbumAddNewDTO();
        albumAddNewDTO.setDescription("asdsd");
        albumAddNewDTO.setName("bbbbu");
        albumAddNewDTO.setSort(30);
        try {
            iAlbumService.addNew(albumAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }

    @Test
    public void testDeleteById(){
        Long id = 4L;
        try{
            iAlbumService.deleteByID(id);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }

}
