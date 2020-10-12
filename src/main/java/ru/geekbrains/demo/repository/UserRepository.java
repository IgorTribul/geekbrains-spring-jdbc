package ru.geekbrains.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.demo.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findAllByAgeBetween(int min, int max);
    List<User> deleteUsersByName(String name);

}
