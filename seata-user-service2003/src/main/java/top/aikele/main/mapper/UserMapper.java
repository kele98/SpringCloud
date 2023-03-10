package top.aikele.main.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int subMoney(int id,int number);
}
