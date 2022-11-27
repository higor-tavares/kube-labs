package com.higortavares.bookstore.adapter.persistence.ports

import com.higortavares.bookstore.domain.model.Product

interface ProductPersistencePort {
    fun save(product: Product) : Product
    fun findAll() : List<Product>
}