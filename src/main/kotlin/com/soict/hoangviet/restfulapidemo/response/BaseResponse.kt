package com.soict.hoangviet.restfulapidemo.response

import org.springframework.http.HttpStatus

open class BaseResponse {
    var status: Int? = HttpStatus.OK.value()
    var msg: String? = null

    constructor()

    constructor(msg: String) {
        this.msg = msg
    }

    constructor(status: Int, msg: String) {
        this.status = status
        this.msg = msg
    }
}