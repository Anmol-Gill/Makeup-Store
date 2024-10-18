package com.anmolgill.makeupstore.service;

import com.anmolgill.makeupstore.model.Order;
import com.anmolgill.makeupstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Creates order
    @Transactional
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Order of user
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Order list of user
    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    // Deletes order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
