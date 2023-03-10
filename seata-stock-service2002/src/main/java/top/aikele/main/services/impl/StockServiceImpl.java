package top.aikele.main.services.impl;

import cn.hutool.cron.timingwheel.TimerTaskList;
import com.aikele.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aikele.main.mapper.StockMapper;
import top.aikele.main.services.StockService;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;
    @Override
    public CommonResult subStock(int id, int stock) {
        int i = stockMapper.subStock(id, stock);
        if(i!=0)
        return new CommonResult(200,"成功更新");
        else
            return new CommonResult(500,"未知错误");
    }
}
