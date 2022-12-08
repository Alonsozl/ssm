package com.ssm.ssm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.ssm.domain.Book;
import com.ssm.ssm.service.BookService;
import com.ssm.ssm.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【book】的数据库操作Service实现
* @createDate 2022-11-28 15:48:45
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




