package com.vlad.junit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void usersEmptyIfNotUserAdded() {
        var userService = new UserService();
        var users = userService.getAll();
        assertTrue(users.isEmpty(), () -> "User list should be empty");//assertFalse
    }
}
