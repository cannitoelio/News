package com.coding.challenge.news.repositories;

import com.coding.challenge.news.models.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void testCreateUser() throws Exception {
        User user = new User();
        user.setEmail("elio.cannito@gmail.com");
        user.setPassword("password");
        User saved = userRepository.save(user);
        User exist = testEntityManager.find(User.class, saved.getIdUser());
        assertThat(exist.getEmail()).isEqualTo(saved.getEmail());
    }

}
