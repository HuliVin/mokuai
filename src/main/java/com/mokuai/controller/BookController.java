package com.mokuai.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mokuai.pojo.Book;
import com.mokuai.service.IBookService;
import com.mokuai.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("books")
public class BookController {
   @Autowired
     private IBookService  bookService;

    //查所有
    @GetMapping
    public R gteAll(){
        return new R(true,bookService.list());

    }
    //增
    @PostMapping
    public R bookSave(@RequestBody Book book){
     Boolean flag=   bookService.save(book);
    return new R(flag,flag ? "添加成功":"添加失败");
    }

    //改
     @PutMapping
    public  R bookUpdate(@RequestBody Book book){

         return new R(bookService.updateById(book));
     }
     //删
     @DeleteMapping("delete{id}")
    public R bookDlete(@PathVariable Integer id){

         return new R(true,(bookService.removeById(id)));
     }
     //查单个
    @GetMapping("findBy{id}")
    public R bookByid(@PathVariable Integer id){

        return new R(true,bookService.getById(id));
    }
    //分页
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
      IPage<Book> page= bookService.getPage(currentPage,pageSize);
      if(currentPage>page.getPages()){
          page=bookService.getPage((int)page.getPages(),pageSize);
      }
        return new R(true,page);
    }


}
