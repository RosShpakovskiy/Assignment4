package kz.aitu.onlinebook.services;

import kz.aitu.onlinebook.models.User;
import kz.aitu.onlinebook.repositories.UserRepositoryInterface;
import kz.aitu.onlinebook.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;
@Service

public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }
    @Override
    public User create(User user) {
        return repo.save(user);
    }

}
