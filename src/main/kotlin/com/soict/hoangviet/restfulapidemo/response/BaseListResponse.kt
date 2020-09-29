package com.soict.hoangviet.restfulapidemo.response

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
open class BaseListResponse<T> : BaseResponse {
    var data: ArrayList<T> = arrayListOf()

    constructor(status: Int, msg: String, data: List<T>) : super(status, msg) {
        this.data.addAll(data)
    }

    constructor(msg: String, data: List<T>) : super(msg) {
        this.data.addAll(data)
    }

    constructor(data: List<T>) : super() {
        this.data.addAll(data)
    }
}