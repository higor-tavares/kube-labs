package com.higortavares.bookstore.adapter.web.request

import com.higortavares.bookstore.domain.model.Product
import java.time.LocalDateTime


data class ProductSaveRequest(
    val name: String,
    val description: String,
    val photo: String,
    val price: Int)
{
    fun toModel() : Product{
        return Product(null,name, description, price, photo, LocalDateTime.now())
    }
}

