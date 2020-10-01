package com.soict.hoangviet.restfulapidemo.entity

import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book")
class Book(
        @Id @GeneratedValue
        var id: Long? = null,
        var name: String,
        var author: String
)