package ru.netology.spring_boot_rest.repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ru.netology.spring_boot_rest.domain.Authorities;

@Repository
public class UserRepository {

    private final Map<String, String> users = Map.of(
            "admin", "admin",
            "user", "user"
    );

    private final Map<String, List<Authorities>> authoritiesByUser = Map.of(
            "admin", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE),
            "user", List.of(Authorities.READ, Authorities.WRITE)
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        String expectedPassword = users.get(user);
        if (expectedPassword == null || !expectedPassword.equals(password)) {
            return Collections.emptyList();
        }
        return authoritiesByUser.getOrDefault(user, Collections.emptyList());
    }
}