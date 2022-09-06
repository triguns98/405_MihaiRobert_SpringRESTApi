package com.robert_alexandru_mihai.friendlly.friendlly.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert_alexandru_mihai.friendlly.friendlly.models.User;
import com.robert_alexandru_mihai.friendlly.friendlly.services.IUserService;

@RestController
@RequestMapping("api/users")
public class UsersController {

    private IUserService userService;

    public UsersController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUsers(@PathVariable int userId) {
        return new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return ResponseEntity.status(204).build();
    }
}
