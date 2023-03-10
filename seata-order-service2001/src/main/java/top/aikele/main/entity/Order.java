package top.aikele.main.entity;

import lombok.*;

@AllArgsConstructor
@Data
public class Order {
    private int id;
    private int user_id;
    private int stock_id;
    private int number;
}
