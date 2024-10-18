package com.anmolgill.makeupstore.service;

import com.anmolgill.makeupstore.model.OrderItem;
import com.anmolgill.makeupstore.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    //Creates order items
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    //Gets order by ID
    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    //List of order items by ID
    public List<OrderItem> getOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }

    //Deletes order item
    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}

