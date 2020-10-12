package ru.geekbrains.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.geekbrains.demo.model.User;
import ru.geekbrains.demo.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void findAll(){
        System.out.println(userRepository.findAll());
    }

    public List<User> findAllByAgeBetween(int minAge, int maxAge){
        return userRepository.findAllByAgeBetween(minAge, maxAge);
    }



}
