package com.mokuai.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mokuai.pojo.Book;

public interface IBookService extends IService<Book>{

  IPage<Book> getPage(int currentpage,int pageSize);
}
