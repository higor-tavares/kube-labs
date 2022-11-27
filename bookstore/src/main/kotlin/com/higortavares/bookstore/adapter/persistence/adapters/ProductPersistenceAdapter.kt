package com.higortavares.bookstore.adapter.persistence.adapters

import com.higortavares.bookstore.adapter.persistence.ports.ProductPersistencePort
import com.higortavares.bookstore.domain.model.Product
import org.springframework.stereotype.Component

@Component
class ProductPersistenceAdapter(private val productRepository: ProductRepository) : ProductPersistencePort{

    override fun save(product: Product): Product {
         return productRepository.save(product)
    }

    override fun findAll(): List<Product> {
      return productRepository.findAll()
    }
}