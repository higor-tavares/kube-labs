package com.higortavares.bookstore.domain.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="products")
@SequenceGenerator(name = "productSeq", sequenceName = "product_id_seq", allocationSize = 1)
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSeq")
    val id: Long?,
    val name: String,
    val description: String,
    val price: Int,
    val photo: String,
    val createdAt: LocalDateTime
)