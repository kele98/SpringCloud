package top.aikele.main.services.impl;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;
import top.aikele.main.services.UserService;
@Component
public class UserServiceImpl implements UserService {
    @Override
    public CommonResult subMoney(int id, int number) {
        return new CommonResult(500,"发生了错误,默认的fallback方法被调用");
    }
}
