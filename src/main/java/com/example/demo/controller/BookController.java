package com.example.demo.controller;

import com.example.demo.Entity.Book;
import com.example.demo.pojo.BookPojo;
import com.example.demo.pojo.BookProjection;
import com.example.demo.pojo.GlobalApiResponse;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Book")
@RequiredArgsConstructor
public class BookController {
    private final BookController BookService;

    @GetMapping("/list")
    public List<BookProjection> findAll() {
        return this.BookService.findAll();
    }


    @GetMapping("/list2")
    public List<Book> findAll2() {
        return this.BookService.findAll2();
    }


    @PostMapping("/save")
    public GlobalApiResponse<Integer> saveBook(@RequestBody BookPojo bookPojo) {
        GlobalApiResponse<Integer> globalApiResponse= new GlobalApiResponse<>();
        GlobalApiResponse<Integer> bookId= BookService.saveBook(bookPojo);
        globalApiResponse.setData(bookId.getData());
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");

        return globalApiResponse;
    }


    @PutMapping("/update")
    public void bookUpdate(@RequestBody BookPojo bookPojo) {
        BookService.saveBook(bookPojo);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        BookService.deleteById(id);
    }

    private void deleteById(Integer id) {

    }

    @GetMapping("/getById/{id}")
    public Book findById(@PathVariable Integer id) {
        return this.BookService.findById(id);
    }

}
