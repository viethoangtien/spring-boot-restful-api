package com.soict.hoangviet.restfulapidemo.repository

import com.soict.hoangviet.restfulapidemo.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>