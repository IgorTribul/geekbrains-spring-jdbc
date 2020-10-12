package ru.geekbrains.demo.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.geekbrains.demo.model.User;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    private UserRepository clearRepository;

    @Test
    public void findAll() {
        List<User> users = newUsers();
        List<User> savedUsers = userRepository.saveAll(users);
        List<User> usersAll = userRepository.findAll();
        System.out.println(usersAll);

        Assertions.assertEquals(8, usersAll.size());
    }

    @Test
    public void findAllByAgeBetween(){
        List<User> users = newUsers();
        List<User> savedUsers = userRepository.saveAll(users);
        List<User> usersAge = userRepository.findAllByAgeBetween(25, 35);
        System.out.println(usersAge);

        Assertions.assertEquals(4, usersAge.size());
    }

    @Test
    public void deleteUserByName() {
        List<User> users = newUsers();
        List<User> savedUsers = userRepository.saveAll(users);
        List<User> listUsersWithoutAlex = userRepository.deleteUsersByName("Alex");
        System.out.println(userRepository.findAll());

        Assertions.assertEquals(6, userRepository.findAll().size());
    }

    private List<User> newUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(null, "Alex", "alex@mail.ru", 25));
        users.add(new User(null, "Oleg", "oleg@mail.ru", 18));
        users.add(new User(null, "Anton", "anton@mail.ru", 35));
        users.add(new User(null, "Maria", "maria@mail.ru", 20));
        users.add(new User(null, "Dana", "dana@mail.ru", 33));
        users.add(new User(null, "Peter", "peter@mail.ru", 23));
        users.add(new User(null, "Gogi", "gogi@mail.ru", 40));
        users.add(new User(null, "Alex", "alex@mail.ru", 27));
        return users;
    }
}