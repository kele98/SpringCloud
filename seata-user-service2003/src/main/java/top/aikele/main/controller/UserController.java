package top.aikele.main.controller;

import com.aikele.springcloud.entities.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.aikele.main.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;
    @PutMapping("/{id}/{number}")
    public CommonResult subMoney(@PathVariable("id") int id,@PathVariable("number") int number ){
        return  service.subMoney(id,number);
    }
}
