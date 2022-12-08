package com.ssm.ssm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ssm.ssm.domain.Book;
import com.ssm.ssm.domain.Record;
import com.ssm.ssm.domain.User;
import com.ssm.ssm.service.BookService;
import com.ssm.ssm.service.RecordService;
import com.ssm.ssm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SsmApplicationTests {

    @Resource
    private UserService userService;

    @Resource
    private BookService bookService;

    @Resource
    private RecordService recordService;

    @Test
    void contextLoads() {
        Record record = recordService.getById(20221128);
        System.out.println(record);
    }

}
