package com.vlad.junit.service;

import com.vlad.junit.dto.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserServiceTest {

    private UserService userService;

    @BeforeAll
    void initAll() {
        System.out.println("Before all: " + this);
    }

    @BeforeEach
    void prepare() {
        System.out.println("Before each: " + this);
        userService = new UserService();
    }

    @Test
    void usersEmptyIfNotUserAdded() {
        System.out.println("Test 1: " + this);
        var users = userService.getAll();
        assertTrue(users.isEmpty(), "User list should be empty");//assertFalse
    }

    @Test
    void usersSizeIfUserAdded() {
        System.out.println("Test 2: " + this);
        userService.add(new User());
        userService.add(new User());

        var users = userService.getAll();
        assertEquals(4, users.size());
    }

    @AfterEach
    void deleteDataFromDataBase() {
        System.out.println("After each: " + this);
        System.out.println();
    }

    @AfterAll
    void closeConnectionPool() {
        System.out.println("After all: " + this);
    }
}
