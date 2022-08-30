package com.mokuai.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mokuai.mapper.BookMapper;
import com.mokuai.pojo.Book;
import com.mokuai.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements  IBookService {
  @Autowired
  private  BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(@PathVariable int currentpage, int pageSize) {
        IPage page=new Page(currentpage,pageSize);
        bookMapper.selectPage(page,null);
       return page;
    }
}
