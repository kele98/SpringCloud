package top.aikele.main.dao;

import org.apache.ibatis.annotations.Mapper;
import top.aikele.main.entity.Order;

@Mapper
public interface OrderMapper {
    public boolean insert(Order order);
}
