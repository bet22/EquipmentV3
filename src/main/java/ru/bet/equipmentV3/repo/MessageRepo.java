package ru.bet.equipmentV3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bet.equipmentV3.domain.Message;

public interface MessageRepo extends JpaRepository<Message,Long> {
}
