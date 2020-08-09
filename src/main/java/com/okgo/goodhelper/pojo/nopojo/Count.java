package com.okgo.goodhelper.pojo.nopojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Count {
    private Integer good_num;
    private Integer gln0_num;
    private Integer gln1_num;
}
