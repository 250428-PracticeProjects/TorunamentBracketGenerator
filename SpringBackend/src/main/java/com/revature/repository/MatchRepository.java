package com.revature.repository;

import com.revature.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    // This interface will automatically inherit all the CRUD methods from JpaRepository
    // We can also define custom query methods here if needed
    // For example, if we want to find a match by its id:
    Optional<Match> findById(int id);
}
