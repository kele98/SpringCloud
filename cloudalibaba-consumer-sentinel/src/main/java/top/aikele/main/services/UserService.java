package top.aikele.main.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "nacos-payment-provider")
public interface UserService {
    @GetMapping("/payment/{id}")
    public String payment(@PathVariable("id") int id);
}
