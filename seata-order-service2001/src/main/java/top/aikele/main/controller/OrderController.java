package top.aikele.main.controller;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aikele.main.entity.Order;
import top.aikele.main.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping
    @GlobalTransactional
    public void post(@ModelAttribute  Order order){
        orderService.creat(order);
    }
    @GetMapping("/{id}")
    public void get(@PathVariable("id") int id){
        System.out.println(id);
    }
}
