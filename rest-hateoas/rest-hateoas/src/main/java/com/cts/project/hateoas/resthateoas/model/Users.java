package com.cts.project.hateoas.resthateoas.model;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

public class Users extends ResourceSupport {
    private String name;
    private int age;
    private Address address;

    public Users(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users:" +
                "name=" + name +
                "age=" + age
                ;
    }
}
