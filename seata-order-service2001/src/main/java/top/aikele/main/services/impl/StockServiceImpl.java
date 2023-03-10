package top.aikele.main.services.impl;

import com.aikele.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;
import top.aikele.main.services.StockService;
@Component
public class StockServiceImpl implements StockService {
    @Override
    public CommonResult subStock(int id, int stock) {
        return new CommonResult(500,"发生了错误,默认的fallback方法被调用");
    }
}
