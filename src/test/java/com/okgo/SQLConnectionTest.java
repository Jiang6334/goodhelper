package com.okgo;


import com.okgo.goodhelper.GoodHelperApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = GoodHelperApplication.class )
public class SQLConnectionTest {

    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoad() throws SQLException {


    }


}
