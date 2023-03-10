package top.aikele.main.services;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public interface UserService {


//    @PutMapping("/user/{id}/{number}")
    CommonResult subMoney(int id, int number);
}
