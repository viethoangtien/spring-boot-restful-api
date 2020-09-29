package com.soict.hoangviet.restfulapidemo.utils

object Define {
    object Api {
        const val BOOKS = "api/v1/books"
        const val BOOKS_ID = "api/v1/books/{id}"
    }

    object Message {
        const val GET_DATA_SUCCESS = "Lấy dữ liệu thành công"
        const val GET_DATA_NOT_FOUND = "Không tồn tại bản ghi"
        const val POST_DATA_SUCESS = "Tạo mới dữ liệu thành công"
        const val PUT_DATA_SUCCESS = "Cập nhật dữ liệu thành công"
        const val DELETE_DATA_SUCCESS = "Xóa dữ liệu thành công"
        const val ERROR_TRY_AGAIN = "Có lỗi xảy ra. Vui lòng thử lại"
    }
}