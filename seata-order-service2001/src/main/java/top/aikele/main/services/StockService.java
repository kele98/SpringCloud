package top.aikele.main.services;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import top.aikele.main.services.impl.StockServiceImpl;

@FeignClient(name = "seata-stock",fallback = StockServiceImpl.class)
public interface StockService {
    @PutMapping("/stock/{id}/{stock}")
    CommonResult subStock(@PathVariable(name = "id") int id,@PathVariable(name = "stock") int stock);
}
