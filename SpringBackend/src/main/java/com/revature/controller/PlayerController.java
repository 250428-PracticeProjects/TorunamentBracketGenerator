package com.revature.controller;

import com.revature.model.Player;
import com.revature.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Player> registerPlayer(@RequestBody Player player) {
        // Logic to register a player
        // TODO - Add validation and business logic as needed
        // Validate the player does not already exist
        Player savedPlayer = playerService.registerPlayer(player);
        if (savedPlayer == null) {
            // Return an error response if the player could not be registered
            return ResponseEntity.internalServerError().build();
        }
        // Return a success response with the registered player
        //return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPlayer);
    }
    // Get all players
    @GetMapping("all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players); // 200 OK
    }
}
