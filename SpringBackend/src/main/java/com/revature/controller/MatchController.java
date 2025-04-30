package com.revature.controller;
import com.revature.model.Match;
import com.revature.model.Player;
import com.revature.service.MatchService;
import com.revature.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("matches")
@RestController
public class MatchController {

    private final MatchService matchService;
    private final PlayerService playerService;
    // Constructor-based dependency injection
    @Autowired
    public MatchController(MatchService matchService, PlayerService playerService) {
        this.matchService = matchService;
        this.playerService = playerService;
    }
    // Add methods to handle match-related requests here
    @PostMapping("register")
    public ResponseEntity<Match> registerMatch(@RequestBody Match match) {
        // Get Player1 and Player2 by IplayerService;
        Player player1 = playerService.getPlayerById(match.getPlayer1().getId());
        Player player2 = playerService.getPlayerById(match.getPlayer2().getId());

        match.setPlayer1(player1);
        match.setPlayer2(player2);
        // Winner value is an empty string by default
        match.setWinner(null);
        Match registeredMatch = matchService.registerMatch(match);
       // TODO Validate that players exist and are not already in a match
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredMatch);
    }

    @GetMapping("all")
    public ResponseEntity<List<Match>> getAllMatches() {
        List<Match> matches = matchService.getAllMatches();
        return ResponseEntity.ok(matches); // 200 OK
    }

    @PatchMapping("winner/{matchId}")
    public ResponseEntity<Match> updateMatchWinner(@PathVariable int matchId, @RequestParam Player winner) {
        Match updatedMatch = matchService.updateMatchWinner(matchId, winner);
        if (updatedMatch == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(updatedMatch); // 200 OK
    }

}
