package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AlbumMapperTests {
    @Autowired
    AlbumMapper mapper;

    @Test
    void testInsert() {
        Album album = new Album();
        album.setName("asdsadsa").setDescription("asdasdasd").setSort(63);
        int i = mapper.insert(album);
        System.out.println(i);
    }

    @Test
    void testInsertBatch() {
        List<Album> albums = new ArrayList<>();
        Album album = new Album();
        album.setSort(2).setName("biu");
        albums.add(album);
        int i = mapper.insertBatch(albums);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

    @Test
    void testDeleteByIds(){
        Long[] ids = {1L,2L,3L};
        int i = mapper.deleteByIds(ids);
        System.out.println(i);
    }

    @Test
    void testUpdate() {
        Album album = new Album();
        album.setId(2L);
        album.setName("asdsadsa").setDescription("asdasdasd").setSort(63);
        int i = mapper.update(album);
        System.out.println(i);
        System.out.println(album);
    }

    @Test
    void testCount(){
        int count = mapper.count();
        System.out.println(count);
    }

    @Test
    void testSelect(){
        AlbumStandardVo standardById = mapper.getStandardById(3L);
        System.out.println(standardById);
    }


}
