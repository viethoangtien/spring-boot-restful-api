package com.soict.hoangviet.restfulapidemo.controller

import com.soict.hoangviet.restfulapidemo.entity.Book
import com.soict.hoangviet.restfulapidemo.repository.BookRepository
import com.soict.hoangviet.restfulapidemo.utils.Define
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val bookRepository: BookRepository) {

    @GetMapping(Define.Api.BOOKS)
    fun getBooks() = bookRepository.findAll()

    @GetMapping(Define.Api.BOOKS_ID)
    fun getBookById(@PathVariable id: Long) = bookRepository.findById(id)

    @PostMapping(Define.Api.BOOKS)
    fun newBook(@RequestBody book: Book) {
        bookRepository.save(book)
    }

    @PutMapping(Define.Api.BOOKS_ID)
    fun putBook(@PathVariable id: Long, @RequestBody bookUpdate: Book): Book {
        return bookRepository.findById(id)
                .map {
                    it.name = bookUpdate.name
                    it.author = bookUpdate.author
                    return@map bookRepository.save(it)
                }
                .orElseGet {
                    return@orElseGet bookRepository.save(bookUpdate)
                }
    }

    @DeleteMapping(Define.Api.BOOKS_ID)
    fun deleteBook(@PathVariable id: Long) {
        bookRepository.deleteById(id)
    }
}