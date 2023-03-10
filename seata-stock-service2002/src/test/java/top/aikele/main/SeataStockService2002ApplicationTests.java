package top.aikele.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.aikele.main.controller.StockController;

@SpringBootTest
class SeataStockService2002ApplicationTests {

    @Autowired
    StockController stockController;
    @Test
    void contextLoads() {
        stockController.subStock(1,200);
    }

}
