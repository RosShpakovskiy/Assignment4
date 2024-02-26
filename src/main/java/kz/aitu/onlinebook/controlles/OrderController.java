package kz.aitu.onlinebook.controlles;

import kz.aitu.onlinebook.models.Order;
import kz.aitu.onlinebook.services.interfaces.OrderServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderServiceInterface service;

    public OrderController(OrderServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Order> getAll() {
        return service.getAll();
    }

    @GetMapping("/surname/{order_surname}")
    public List<Order> getAllBySurname(@PathVariable("surname") String surname)  {
        return service.getAllBySurname(surname);
    }
}
