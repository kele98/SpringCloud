package top.aikele.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.aikele.main.controller.UserController;

@SpringBootTest
class SeataUserService2003ApplicationTests {
    @Autowired
    UserController userController;
    @Test
    void contextLoads() {
        userController.subMoney(1,10);
    }

}
