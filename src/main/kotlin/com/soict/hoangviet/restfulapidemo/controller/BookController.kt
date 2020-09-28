package com.soict.hoangviet.restfulapidemo.controller

import com.soict.hoangviet.restfulapidemo.model.Book
import com.soict.hoangviet.restfulapidemo.repository.BookRepository
import com.soict.hoangviet.springbootrestful.utils.Define
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val bookRepository: BookRepository) {

    @GetMapping(Define.Api.BOOKS)
    fun getBooks() = bookRepository.findAll()

}