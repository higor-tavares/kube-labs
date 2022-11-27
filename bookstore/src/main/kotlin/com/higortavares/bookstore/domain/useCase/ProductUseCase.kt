package com.higortavares.bookstore.domain.useCase

import com.higortavares.bookstore.adapter.persistence.ports.ProductPersistencePort
import com.higortavares.bookstore.domain.model.Product
import org.springframework.stereotype.Service

@Service
class ProductUseCase(private val productPersistencePort: ProductPersistencePort) {
    fun save(product: Product) : Product{
        return productPersistencePort.save(product)
    }
    fun findAll() : List<Product>{
        return productPersistencePort.findAll()
    }
}