package com.soict.hoangviet.restfulapidemo.controller

import com.soict.hoangviet.restfulapidemo.entity.Book
import com.soict.hoangviet.restfulapidemo.repository.BookRepository
import com.soict.hoangviet.restfulapidemo.response.BaseListResponse
import com.soict.hoangviet.restfulapidemo.response.BaseObjectResponse
import com.soict.hoangviet.restfulapidemo.utils.Define
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val bookRepository: BookRepository) {

    @GetMapping(Define.Api.BOOKS)
    fun getBooks(@RequestParam queryMap: Map<String, String?>) = BaseListResponse(
            status = HttpStatus.OK.value(),
            msg = Define.Message.GET_DATA_SUCCESS,
            data = bookRepository.findAll(PageRequest.of(
                    queryMap[Define.QueryParam.PAGE]?.let { Integer.parseInt(it) - 1}
                            ?: Define.QueryParam.DEFAULT_PAGE,
                    queryMap[Define.QueryParam.LIMIT]?.let { Integer.parseInt(it) }
                            ?: Define.QueryParam.DEFAULT_LIMIT)).toList()
    )

    @GetMapping(Define.Api.BOOKS_ID)
    fun getBookById(@PathVariable id: Long) = bookRepository.findById(id)
            .map {
                return@map BaseObjectResponse(
                        status = HttpStatus.OK.value(),
                        msg = Define.Message.GET_DATA_SUCCESS,
                        data = bookRepository.findById(id)
                )
            }
            .orElseGet {
                return@orElseGet BaseObjectResponse(
                        status = HttpStatus.NOT_FOUND.value(),
                        msg = Define.Message.GET_DATA_NOT_FOUND
                )
            }

    @PostMapping(Define.Api.BOOKS)
    fun newBook(@RequestBody book: Book) = BaseObjectResponse(
            status = HttpStatus.OK.value(),
            msg = Define.Message.POST_DATA_SUCESS,
            data = bookRepository.save(book)
    )

    @PutMapping(Define.Api.BOOKS_ID)
    fun putBook(@PathVariable id: Long, @RequestBody bookUpdate: Book) = bookRepository.findById(id)
            .map {
                it?.apply {
                    name = bookUpdate.name
                    author = bookUpdate.author
                }
                return@map BaseObjectResponse(
                        status = HttpStatus.OK.value(),
                        msg = Define.Message.PUT_DATA_SUCCESS,
                        data = bookRepository.save(it)
                )
            }
            .orElseGet {
                return@orElseGet BaseObjectResponse(
                        status = HttpStatus.OK.value(),
                        msg = Define.Message.PUT_DATA_SUCCESS,
                        data = bookRepository.save(bookUpdate)
                )
            }

    @DeleteMapping(Define.Api.BOOKS_ID)
    fun deleteBook(@PathVariable id: Long) = bookRepository.findById(id)
            .map {
                return@map BaseObjectResponse(
                        status = HttpStatus.OK.value(),
                        msg = Define.Message.DELETE_DATA_SUCCESS,
                        data = bookRepository.deleteById(id)
                )
            }
            .orElseGet {
                return@orElseGet BaseObjectResponse(
                        status = HttpStatus.NOT_FOUND.value(),
                        msg = Define.Message.GET_DATA_NOT_FOUND
                )
            }
}