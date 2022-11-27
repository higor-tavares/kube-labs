package com.higortavares.bookstore.adapter.web.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.higortavares.bookstore.domain.model.Product
import java.time.LocalDateTime

data class ProductResponse(
    val id: Long,
    val name: String,
    val description: String,
    val price: Int,
    val photo: String,
    @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    val createdAt: LocalDateTime
){
    companion object{
        operator fun invoke(product: Product) : ProductResponse{
            return ProductResponse(product.id!!, product.name, product.description,product.price, product.photo, product.createdAt)
        }
    }
}