package com.marcygon.snakesandladders.Domain.Repositories;

import com.marcygon.snakesandladders.Domain.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPlayerRepository extends JpaRepository<Player, Long> {
    @Query("SELECT MAX(p.playerNumber) FROM Player p")
    Integer findMaxPlayerNumber();
}
