package com.okgo.goodhelper.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gleaning {

    private Integer user_id;
    private Integer gln_id;
    private String gln_name;
    private String image;
    private String description;
    private String gln_time;
    private String address;
    private String is_public;   //char
    private String contact;
    private String create_time;
    private String failure_time;
    private String type;    //char
    private String status;  // char


}
