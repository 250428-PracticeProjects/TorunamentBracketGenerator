package com.revature.service;
import com.revature.model.Match;
import com.revature.model.Player;
import com.revature.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    // Add methods to interact with the MatchRepository here
    public Match registerMatch(Match match) {
        // Logic to register a match
        // TODO - Add validation and business logic as needed
        return matchRepository.save(match);
    }

    // Get all matches
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    // Update match winner
    public Match updateMatchWinner(int matchId, Player winner) {
        Match match = matchRepository.findById(matchId).orElse(null);
        if (match != null) {
            match.setWinner(winner);
            return matchRepository.save(match);
        }
        return null; // Match not found
    }
}
