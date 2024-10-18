package com.anmolgill.makeupstore.tests;

import com.anmolgill.makeupstore.model.User;
import com.anmolgill.makeupstore.repository.UserRepository;
import com.anmolgill.makeupstore.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testCreateUser() {
        User user = new User("john", "password123", "john@example.com");
        when(userRepository.save(user)).thenReturn(user);

        User savedUser = userService.createUser(user);
        assertEquals(user, savedUser, "The saved user should match the original user");
    }

    @Test
    public void testFindByUsername() {
        // Arrange: Create a sample user
        User user = new User("johndoe", "password123", "john@example.com");

        // Mock the behavior of the repository to return the user when searched by username
        when(userRepository.findByUsername("johndoe")).thenReturn(Optional.of(user));

        // Act: Call the service to find the user
        Optional<User> foundUser = userService.findByEmail("johndoe");

        // Assert: Verify that the user was found
        assertTrue(foundUser.isPresent(), "User should be found by username");
        assertEquals("johndoe", foundUser.get().getUsername(), "Username should match");

    }

    @ParameterizedTest
    @ValueSource(strings = {"short", "medium123", "thisisaverylongpassword123"})
    public void testPasswordLength(String password) {
        assertTrue(password.length() >= 5, "Password should be at least 5 characters long");
    }
}

