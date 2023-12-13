package com.marcygon.snakesandladders.Domain.Services;

import com.marcygon.snakesandladders.Domain.Models.Player;
import com.marcygon.snakesandladders.Domain.Repositories.IPlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlayerServiceTest {
    @Autowired
    private IPlayerRepository iPlayerRepository;

    @Autowired
    private PlayerService playerService;

    @Test
    @DirtiesContext
    public void testPlayerNumberAssignment() {
        // Save a player with a specific number
        Player player1 = new Player();
        player1.setPlayerName("Player 1");
        player1.setPlayerNumber(5);
        playerService.savePlayer(player1);

        // Save a player without specifying the number
        Player player2 = new Player();
        player2.setPlayerName("Player 2");
        playerService.savePlayer(player2);

        // Retrieve players from the database
        Player savedPlayer1 = iPlayerRepository.findById(player1.getId()).orElse(null);
        Player savedPlayer2 = iPlayerRepository.findById(player2.getId()).orElse(null);

        // Check if the player numbers are assigned correctly
        assert savedPlayer1 != null;
        assertEquals(5, savedPlayer1.getPlayerNumber());
        assert savedPlayer2 != null;
        assertEquals(6, savedPlayer2.getPlayerNumber()); // We expect the next available number
    }
}