package kz.aitu.onlinebook.services.interfaces;

import kz.aitu.onlinebook.models.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAll();
    List<Order> getAllBySurname(String surname);
}
