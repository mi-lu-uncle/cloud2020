package com.floatpoint.springcloud.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//全参构造方法
@NoArgsConstructor//无参构造方法
public class Payment {
    private Long id;
    private String serial;

}
