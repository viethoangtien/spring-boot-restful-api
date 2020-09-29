package com.soict.hoangviet.restfulapidemo.entity

import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(
        @Id @GeneratedValue
        var id: Long? = null,
        var name: String,
        var author: String
)