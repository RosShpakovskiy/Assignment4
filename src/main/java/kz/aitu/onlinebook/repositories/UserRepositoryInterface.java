package kz.aitu.onlinebook.repositories;

import kz.aitu.onlinebook.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
}
