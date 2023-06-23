package com.xinmen.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_book")
public class Book {
    private Long id;
    private String name;
    private String type;
    private String description;


}
