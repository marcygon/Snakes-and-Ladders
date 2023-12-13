package com.marcygon.snakesandladders.Domain.Services;

import com.marcygon.snakesandladders.Domain.Models.Player;
import com.marcygon.snakesandladders.Domain.Repositories.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final IPlayerRepository iPlayerRepository;

    @Autowired
    public PlayerService(IPlayerRepository iPlayerRepository) {
        this.iPlayerRepository = iPlayerRepository;
    }

    public void savePlayer(Player player) {
        if (player.getPlayerNumber() == null) {
            Integer maxPlayerNumber = iPlayerRepository.findMaxPlayerNumber();
            player.setPlayerNumber((maxPlayerNumber != null) ? maxPlayerNumber + 1 : 1);
        }
        iPlayerRepository.save(player);
    }
}
