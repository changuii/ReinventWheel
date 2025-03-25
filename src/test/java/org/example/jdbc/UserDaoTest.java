package org.example.jdbc;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    @DisplayName("getConnect")
    @Test
    void getConnect() {
        // given
        UserDao userDao = new UserDao();

        // when
        final Connection connection = userDao.getConnection();

        // then
        assertThat(connection).isNotNull();
    }

    @Test
    public void addUser() {
        // given
        UserDao userDao = new UserDao();
        final var user = new User("testUserId", "testUser");

        // when & then
        userDao.addUser(user);
    }

    @Test
    public void findByUserId() {
        // given
        UserDao userDao = new UserDao();
        final var user = userDao.findByUserId("testUserId");

        assertThat(user).isEqualTo(new User("testUserId", "testUser"));
    }

}
