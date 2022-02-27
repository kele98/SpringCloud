package top.aikele.springcloud.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value="nacos-payment-provider")
public interface Test {
    @GetMapping("/payment/get/{id}")
    Long get(@PathVariable("id")Long id);

}
