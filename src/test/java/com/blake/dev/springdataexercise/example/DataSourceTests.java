package com.blake.dev.springdataexercise.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Blake on 2018/10/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataSourceTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSourceTest() throws SQLException {

        log.info("=========> [{}]", dataSource.getClass());

        Connection connection = dataSource.getConnection();

        log.info("===========> [{}]", connection.toString());
        connection.close();
    }

}
