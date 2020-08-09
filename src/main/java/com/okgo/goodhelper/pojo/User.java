package com.okgo.goodhelper.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer user_id;
    private String wx_name;
    private String avatar;
    private String gender;
    private String country;
    private String province;
    private String city;
    private String language;
    private String openid;
    private String is_alumni;
    @JsonFormat(pattern = "yy-mm-dd hh:mm:ss",locale = "zh",timezone = "GMT-8")
    private Date create_time;
    @JsonFormat(pattern = "yy-mm-dd hh:mm:ss",locale = "zh",timezone = "GMT-8")
    private Date update_time;


}
