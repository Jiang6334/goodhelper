package com.okgo.goodhelper.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumni {

    private Integer user_id;
    private Integer alumni_id;
    String faculty;
    String major;
    String classes;
    String number;
    String alm_name;
    String create_time;


}