package com.soict.hoangviet.restfulapidemo.repository

import com.soict.hoangviet.restfulapidemo.entity.Book
import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.domain.Pageable


interface BookRepository : JpaRepository<Book, Long>