package com.soict.hoangviet.restfulapidemo.repository

import com.soict.hoangviet.restfulapidemo.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>