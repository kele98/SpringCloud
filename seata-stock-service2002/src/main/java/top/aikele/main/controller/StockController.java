package top.aikele.main.controller;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.aikele.main.services.StockService;

@RequestMapping("/stock")
@RestController
public class StockController {

    @Autowired
    StockService stockService;
    @PutMapping("/{id}/{stock}")
    public CommonResult subStock(@PathVariable(name = "id") int id,@PathVariable(name = "stock") int stock){
        return stockService.subStock(id,stock);
    }
}
