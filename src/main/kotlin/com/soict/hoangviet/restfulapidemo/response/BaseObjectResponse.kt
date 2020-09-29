package com.soict.hoangviet.restfulapidemo.response

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
open class BaseObjectResponse<T> : BaseResponse {
    var data: T? = null

    constructor(status: Int, msg: String, data: T) : super(status, msg) {
        this.data = data
    }

    constructor(status: Int, msg: String) : super(status, msg)

    constructor(msg: String, data: T) : super(msg) {
        this.data = data
    }

    constructor(data: T) {
        this.data = data
    }
}