package com.cts.project.hateoas.resthateoas.controller;

import com.cts.project.hateoas.resthateoas.model.Address;
import com.cts.project.hateoas.resthateoas.model.Users;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @GetMapping("/all")
    public List<Users> getAll(){
Address adr1=new Address(01,"road");
        Address adr2=new Address(02,"palace");
       Users user1= new Users("Mike", 27,adr1);
        Users user2= new Users("Peter", 34,adr2);
        return Arrays.asList(user1,user2);
    }

    @GetMapping("/hateoas/all")
    public List<Users> getHateOASAll(){
        Address adr1=new Address(01,"road");
        Address adr2=new Address(02,"palace");
        Users user1= new Users("Mike", 27,adr1);
        Link link= ControllerLinkBuilder.linkTo(UserController.class)
                .slash(user1.getAddress()).withSelfRel();
        user1.add(link);

        Users user2= new Users("Peter", 34,adr2);
        Link link1= ControllerLinkBuilder.linkTo(UserController.class)
                .slash(user2.getAddress()).withSelfRel();
        user2.add(link1);

        return Arrays.asList(user1,user2);
    }
}
