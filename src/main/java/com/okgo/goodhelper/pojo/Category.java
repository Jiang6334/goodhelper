package com.okgo.goodhelper.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer cate_id;
    private String cate_name;
    private String description;


}
