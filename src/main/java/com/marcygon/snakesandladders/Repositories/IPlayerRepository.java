package com.marcygon.snakesandladders.Repositories;

import com.marcygon.snakesandladders.Domain.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerRepository extends JpaRepository<Player, Long> {
}
