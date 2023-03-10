package top.aikele.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {
    int subStock(@Param("id") int id, @Param("stock")int stock);
}
