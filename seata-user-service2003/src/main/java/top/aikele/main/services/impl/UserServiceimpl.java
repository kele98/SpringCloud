package top.aikele.main.services.impl;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aikele.main.mapper.UserMapper;
import top.aikele.main.services.UserService;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public CommonResult subMoney(int id, int number) {
       return userMapper.subMoney(id,number)!=0?new CommonResult(200,"success"):new CommonResult(500,"未知错误");
    }
}
