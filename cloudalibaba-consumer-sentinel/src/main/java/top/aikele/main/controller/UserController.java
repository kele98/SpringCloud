package top.aikele.main.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.aikele.main.config.MySentinelException;
import top.aikele.main.services.UserService;


@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/pay/{id}")
    @SentinelResource(value = "pay",fallbackClass = MySentinelException.class,blockHandlerClass = MySentinelException.class, blockHandler = "defaultHandler",fallback = "defaultFallback")
    public void pay(@PathVariable("id") int id){
        logger.info("log测试");
        userService.payment(id);
    }

}
