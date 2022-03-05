package com.webshop.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.common.entity.order.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
