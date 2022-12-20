package com.bernardo.api.repositories;

import com.bernardo.api.entities.OrderItem;
import com.bernardo.api.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
