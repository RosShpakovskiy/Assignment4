package kz.aitu.onlinebook.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String surname;
    private String address;
    private String book;
    private String genre;
    private int price;
    private int id;
}
