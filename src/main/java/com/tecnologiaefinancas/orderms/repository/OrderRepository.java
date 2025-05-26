package com.tecnologiaefinancas.orderms.repository;

import com.tecnologiaefinancas.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
