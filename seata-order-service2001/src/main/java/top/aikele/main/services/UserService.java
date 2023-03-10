package top.aikele.main.services;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "seata-user")
public interface UserService {
    @PutMapping("/user/{id}/{number}")
    CommonResult subMoney(@PathVariable(name = "id") int id,@PathVariable(name = "number") int number);
}
