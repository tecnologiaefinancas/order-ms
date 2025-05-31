package com.tecnologiaefinancas.orderms.repository;

import com.tecnologiaefinancas.orderms.dto.OrderResponse;
import com.tecnologiaefinancas.orderms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
