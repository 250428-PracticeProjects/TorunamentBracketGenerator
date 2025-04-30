package com.revature.controller;

import com.revature.model.Player;
import com.revature.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("players")
@RestController
public class PlayerController {

    private final PlayerService playerService;

    // Constructor-based dependency injection
    @Autowired
    public PlayerController (PlayerService playerService) {
        this.playerService = playerService;
    }
    // Add methods to handle player-related requests here
    @PostMapping("register")
    public Player registerPlayer() {
        // Logic to register a player
        // TODO - Add validation and business logic as needed
        // Validate the player does not already exist




        return "Player registered successfully!";
    }
    // Get all players
    @GetMapping("all")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
