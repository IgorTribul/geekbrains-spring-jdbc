package ru.geekbrains.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=IDENTITY)
    private Long id;
    private String name;
    private String emale;
    private Integer age;

    public User(Long id, String name, String emale, Integer age) {
        this.id = id;
        this.name = name;
        this.emale = emale;
        this.age = age;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmale() {
        return emale;
    }

    public void setEmale(String emale) {
        this.emale = emale;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emale='" + emale + '\'' +
                ", age=" + age +
                '}';
    }
}