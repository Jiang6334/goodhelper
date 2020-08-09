package com.okgo.goodhelper.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {

    private Integer user_id;
    private Integer good_id;
    private String good_name;
    private String image;
    private String description;
    private String sell_price;
    private String bid_price;
    private String category;
    private Integer is_new;
    private Integer is_bargain;
    private Integer is_public;
    private Integer is_free;
    private String tag;
    private String trade_place;
    private String contact;
    private String status;   //char
    private String create_time;
    private String update_time;


}
