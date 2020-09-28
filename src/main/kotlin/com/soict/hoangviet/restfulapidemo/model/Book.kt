package com.soict.hoangviet.restfulapidemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(
        @Id @GeneratedValue
        val id: Long? = null,
        val name: String,
        val author: String
)