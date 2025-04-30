package com.revature.repository;
import com.revature.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    // This interface will automatically inherit all the CRUD methods from JpaRepository
    // We can also define custom query methods here if needed
    // For example, if we want to find a player by their name:
    Optional<Player> findByName(String name);
    // Find player by id
    Optional<Player> findById(int id);
}
