package com.mokuai.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mokuai.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {


}
