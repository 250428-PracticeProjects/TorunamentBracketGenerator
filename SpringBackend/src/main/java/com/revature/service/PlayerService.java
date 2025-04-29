package com.revature.service;

import com.revature.model.Player;
import com.revature.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired // Constructor-based dependency injection
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    // Add methods to interact with the PlayerRepository here
    public Player registerPlayer(Player player) {
        // Logic to register a player
        // TODO - Add validation and business logic as needed
        return playerRepository.save(player);
    }

    // Get all users
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
