package com.revature.model;
import jakarta.persistence.*;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne // Many Matches can belong to one Player
    @JoinColumn(name = "player1_id") // This provides info for the column doing the joining
    private Player player1;

    @ManyToOne
    @JoinColumn(name = "player2_id")
    private Player player2;

    private String score;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Player winner;

    public Match() {

    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Player getPlayer1() {
        return player1;
    }
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
    public Player getPlayer2() {
        return player2;
    }
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
     // To string method
    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", score='" + score + '\'' +
                ", winner=" + winner +
                '}';
    }
}
