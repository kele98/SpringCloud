package top.aikele.main.services;

import com.aikele.springcloud.entities.CommonResult;

public interface StockService {
    CommonResult subStock(int id, int stock);
}
