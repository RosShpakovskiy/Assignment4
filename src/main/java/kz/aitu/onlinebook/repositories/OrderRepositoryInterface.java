package kz.aitu.onlinebook.repositories;

import kz.aitu.onlinebook.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {
    List<Order> findAllBySurname(String surname);
}
