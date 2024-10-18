package com.anmolgill.makeupstore.tests;

import com.anmolgill.makeupstore.model.User;
import com.anmolgill.makeupstore.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@Transactional
public class UserRepositoryTest {

    private final UserRepository userRepository;

    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testFindByEmail() {
        User user = new User("john", "password123", "john@example.com");
        userRepository.save(user);

        Optional<User> foundUser = userRepository.findByEmail("john@example.com");
        assertTrue(foundUser.isPresent(), "User should be found by email");
    }

    @Test
    public void testFindByUsername() {
        User user = new User("johndoe", "password123", "john@example.com");
        userRepository.save(user);

        Optional<User> foundUser = userRepository.findByUsername("johndoe");
        assertTrue(foundUser.isPresent(), "User should be found by username");
    }
}

