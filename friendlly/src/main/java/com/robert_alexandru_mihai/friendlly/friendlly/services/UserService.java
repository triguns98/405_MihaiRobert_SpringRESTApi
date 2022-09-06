package com.robert_alexandru_mihai.friendlly.friendlly.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robert_alexandru_mihai.friendlly.friendlly.models.User;
import com.robert_alexandru_mihai.friendlly.friendlly.repository.UserRepository;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public User updateUser(User user) {
        var dbUser = userRepository.getOne(user.getId());
        dbUser.setLastName(user.getLastName());
        dbUser.setName(user.getName());

        return userRepository.save(dbUser);
    }

    @Override
    public void deleteUser(int id) {
        var user = userRepository.getOne(id);
        userRepository.delete(user);
    }
}
