package com.higortavares.bookstore.adapter.web.controller

import com.higortavares.bookstore.adapter.web.request.ProductSaveRequest
import com.higortavares.bookstore.adapter.web.response.ProductResponse
import com.higortavares.bookstore.domain.useCase.ProductUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(private val productUseCase: ProductUseCase) {

    @PostMapping("/")
    fun save(@RequestBody productSaveRequest: ProductSaveRequest) : ResponseEntity<ProductResponse>{
        val product = productUseCase.save(productSaveRequest.toModel())
        return ResponseEntity.status(HttpStatus.CREATED).body(ProductResponse(product))
    }

    @GetMapping("/")
    fun findAll() : ResponseEntity<List<ProductResponse>>{
        val productList = productUseCase.findAll()
        return ResponseEntity.ok(productList.map { ProductResponse(it) })
    }
}