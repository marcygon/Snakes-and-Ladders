package com.marcygon.snakesandladders.Domain.Models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlayerTest {
    @Test
    public void testPlayerModel(){
        //Create a Player
        Player player = new Player();
        player.setPlayerName("John Doe");
        player.setPlayerNumber(1);
        player.setPlayerColor("Blue");

        // Test getters
        assertEquals("John Doe", player.getPlayerName());
        assertEquals(1, player.getPlayerNumber());
        assertEquals("Blue", player.getPlayerColor());
        assertNull(player.getId());

        // Test setters
        player.setPlayerName("Jane Doe");
        player.setPlayerNumber(2);
        player.setPlayerColor("Red");

        assertEquals("Jane Doe", player.getPlayerName());
        assertEquals(2, player.getPlayerNumber());
        assertEquals("Red", player.getPlayerColor());
    }
}