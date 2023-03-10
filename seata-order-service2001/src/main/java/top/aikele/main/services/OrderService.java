package top.aikele.main.services;

import com.aikele.springcloud.entities.CommonResult;
import top.aikele.main.entity.Order;

public interface OrderService {
    CommonResult<Order> creat(Order order);

}
