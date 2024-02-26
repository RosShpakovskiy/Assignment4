package kz.aitu.onlinebook.services;

import kz.aitu.onlinebook.models.Order;
import kz.aitu.onlinebook.repositories.OrderRepositoryInterface;
import kz.aitu.onlinebook.services.interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService implements OrderServiceInterface {

    private final OrderRepositoryInterface repo;

    public OrderService(OrderRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Order> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Order> getAllBySurname(String surname) {
        return repo.findAllBySurname(surname);
    }
}
