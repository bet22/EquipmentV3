package ru.bet.equipmentV3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bet.equipmentV3.domain.User;

public interface UserDelailsRepo extends JpaRepository<User, String> {
    User findByUsername(String username);

}
