package top.aikele.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.aikele.main.dao.OrderMapper;
import top.aikele.main.entity.Order;

@SpringBootTest
class SeataOrderService2001ApplicationTests {
	@Autowired
	OrderMapper orderMapper;
	@Test
	void contextLoads() {

		orderMapper.insert(new Order(1,1,1,1));
	}

}
