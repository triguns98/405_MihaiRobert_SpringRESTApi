package com.robert_alexandru_mihai.friendlly.friendlly.services;

import java.util.List;

import com.robert_alexandru_mihai.friendlly.friendlly.models.User;

public interface IUserService {
    public List<User> getUsers();
    public User getUser(int id);
    public User createUser(User newUser);
    public User updateUser(User user);
    public void deleteUser(int id);
}