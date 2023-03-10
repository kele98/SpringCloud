package top.aikele.main.services.impl;

import com.aikele.springcloud.entities.CommonResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.aikele.main.dao.OrderMapper;
import top.aikele.main.entity.Order;
import top.aikele.main.services.OrderService;
import top.aikele.main.services.StockService;
import top.aikele.main.services.UserService;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    StockService stockService;
    @Autowired
    UserService userService;
    @Override
    public CommonResult<Order> creat(Order order) {
        log.info("订单创建开始:-----------------------------");
        orderMapper.insert(order);
        log.info("订单创建结束:-----------------------------");
        log.info("减库存开始:-----------------------------");
        stockService.subStock(order.getStock_id(), order.getNumber());
        log.info("减库存结束:-----------------------------");
        log.info("扣余额开始:-----------------------------");
        if(userService.subMoney(order.getUser_id(),order.getNumber()).getCode()==500)
            throw new RuntimeException("测试seata错误");
        log.info("扣余额完成:-----------------------------");
        return new CommonResult<>(200,"success");
    }
}
