package br.com.creatingapi.project.controller;

import br.com.creatingapi.project.model.User;
import br.com.creatingapi.project.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUser iUser;

    @GetMapping("/users")
    List<User> list() {
        return (List<User>) iUser.findAll();
    }

}
